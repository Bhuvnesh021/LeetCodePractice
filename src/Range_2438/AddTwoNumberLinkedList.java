package Range_2438;

import java.util.List;

public class AddTwoNumberLinkedList {
    public static void main(String[] args) {
        ListNode firstRoot = new ListNode(2);
        firstRoot.next = new ListNode(4);
        firstRoot.next.next = new ListNode(3);

        ListNode secondRoot = new ListNode(5);
        secondRoot.next = new ListNode(6);
        secondRoot.next.next = new ListNode(4);

        AddTwoNumberLinkedList addTwoNumberLinkedList = new AddTwoNumberLinkedList();
        addTwoNumberLinkedList.addTwoNumbers(firstRoot, secondRoot);
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tempFirst = l1;
        ListNode tempSecond = l2;
        ListNode answer = null;
        ListNode last = null;
        int carry = 0;
        while (tempFirst != null || tempSecond != null) {
            int first = tempFirst!= null ? tempFirst.val : 0;
            int second = tempSecond != null ? tempSecond.val : 0;

            int total = first + second + carry;
            carry = total / 10;
            int toAdd = total % 10;
            if(last == null) {
                last = new ListNode(toAdd);
                answer = last;
            }else {
                last.next = new ListNode(toAdd);
                last = last.next;
            }
            tempFirst = tempFirst != null ? tempFirst.next : null;
            tempSecond = tempSecond != null ? tempSecond.next : null;
        }
        if(carry != 0) last.next = new ListNode(carry);
        return answer;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}