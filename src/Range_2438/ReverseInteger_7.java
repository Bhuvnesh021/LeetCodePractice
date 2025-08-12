package Range_2438;

public class ReverseInteger_7 {
    public static void main(String[] args) {
     ReverseInteger_7 reverseInteger7 = new ReverseInteger_7();
        System.out.println(reverseInteger7.reverse(1534236469));
    }
    public int reverse(int x) {
        int num = 0;
        boolean isNegative = false;
        if(x < 0) {
            isNegative = true;
            x = -x;
        }
        while(x != 0) {
            int rev = x % 10;
            x = x / 10;
            if (num > (Integer.MAX_VALUE - rev) / 10) {
                return 0;
            }
            num = (num * 10) +  rev;
        }
        return isNegative ? -num : num;
    }
}
