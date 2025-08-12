package Range_2438;

public class LC8_StringToInteger {
    public static void main(String[] args) {

        LC8_StringToInteger stringToInteger = new LC8_StringToInteger();
        stringToInteger.myAtoi("-91283472332");
    }

    public int myAtoi(String s) {
        if (s == null || s.isEmpty()) return 0;

        int i = 0;
        int n = s.length();

        // Step 1: Skip leading whitespace
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Step 2: Determine the sign
        int sign = 1;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') sign = -1;
            i++;
        }

        // Step 3: Convert digits
        long num = 0; // Use long to detect overflow before clamping
        boolean hasDigits = false;

        while (i < n && Character.isDigit(s.charAt(i))) {
            hasDigits = true;
            num = num * 10 + (s.charAt(i) - '0');

            // If it exceeds int range, break early
            if (sign == 1 && num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -num < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        if (!hasDigits) return 0;

        num *= sign;

        // Step 4: Clamp to 32-bit signed integer range
        if (num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if (num > Integer.MAX_VALUE) return Integer.MAX_VALUE;

        return (int) num;
    }
}
