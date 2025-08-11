package Range_2438;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingChars {
    public static void main(String[] args) {

        LongestSubStringWithoutRepeatingChars longestSubStringWithoutRepeatingChars = new LongestSubStringWithoutRepeatingChars();
        int abcabcabc = longestSubStringWithoutRepeatingChars.lengthOfLongestSubstring("adcabcade");
        System.out.println(abcabcabc);
    }
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLength = 0;
        Set<Character> set = new HashSet<>();

        while (right < s.length()) {
            char currentChar = s.charAt(right);

            // If character already exists, move left pointer until it's removed
            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        System.out.println(set);
        return maxLength;
    }
}
