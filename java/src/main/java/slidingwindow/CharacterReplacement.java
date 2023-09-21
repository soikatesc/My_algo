package slidingwindow;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CharacterReplacement {
    public static int characterReplacement(String s, int k) {
        Map<Character, Integer> count = new HashMap<>();

        int res = 0;
        int l = 0;

        for (int r = 0; r < s.length(); r++) {
            if (!count.containsKey(s.charAt(r))) {
                count.put(s.charAt(r), 1);
            } else {
                count.put(s.charAt(r), count.get(s.charAt(r)) + 1);
            }

            while ((r - l + 1) - (Collections.max(count.values())) > k) {
                count.put(s.charAt(l), count.get(s.charAt(l)) - 1);
                l += 1;
            }

            res = Math.max(res, r - l + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        characterReplacement(s, k);
    }
}
