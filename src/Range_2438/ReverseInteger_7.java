package Range_2438;

public class ReverseInteger_7 {
    public static void main(String[] args) {
        if(true) {
            System.out.println(964632435 * 10);
            return;
        }
     ReverseInteger_7 reverseInteger7 = new ReverseInteger_7();
        System.out.println(reverseInteger7.reverse(1534236469));
    }
    public int reverse(int x) {
        int num = 0;
        while(x != 0) {
            int rev = x % 10;
            x = x / 10;
            num = (num * 10) +  rev;
            if(num < -2147483648) return 0;
            if(num > 2147483647) return 0;
        }
        return num;
    }
}
