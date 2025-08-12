package Range_2438;

public class LC9_NumberPalindrome {
    public static void main(String[] args) {
        LC9_NumberPalindrome palindrome = new LC9_NumberPalindrome();
        System.out.println(palindrome.isPalindrome(121));
    }
    public boolean isPalindrome(int x) {
        int num = 0;
        int temp = x;
        if(x < 0) {
            return  false;
        }
        while(x != 0) {
            int rev = x % 10;
            x = x / 10;
            num = (num * 10) +  rev;
        }
        return temp == num;
    }
}
