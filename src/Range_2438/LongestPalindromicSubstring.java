package Range_2438;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
//        System.out.println("mnsabcmcba".substring(2,1));
        System.out.println(longestPalindromicSubstring.longestPalindrome("mnsabcmcbamkzxcvbnmmnbvcxzas"));
    }
    public String longestPalindrome(String s) {
        if(s == null) return null;
        if(s.isEmpty()) return "";
        if(s.length() == 1) return s;
        if(isPalindrome(s)) return s;
        int maxLength = 0;
        String result = null;
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length(); j > 0; j--) {
                if(i < j) {
                    String str = s.substring(i, j);
                    if(isPalindrome(str)) {
                        if(str.length() > maxLength) {
                            result = str;
                            maxLength = str.length();
                        }
                    }
                }

            }
        }
        return result;
    }
    private boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
