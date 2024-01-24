package slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingChar {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();

        int l = 0;

        int output = 0;

        for (int r = 0; r < s.length(); r++) {
            while (charSet.contains(s.charAt(r))) {
                charSet.remove(s.charAt(l));
                l++;
            }

            charSet.add(s.charAt(r));
            output = Math.max(output, r - l + 1);
        }


        return output;
    }

    public static void main(String[] args) {
        LongestSubStringWithoutRepeatingChar obj = new LongestSubStringWithoutRepeatingChar();
        obj.lengthOfLongestSubstring("abcabcbb");
    }
}
