package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MinWindowSubPrac {

    public static String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        Map<Character, Integer> countT = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (!countT.containsKey(ch)) {
                countT.put(ch, 1);
            } else {
                countT.put(ch, countT.get(ch) + 1);
            }
        }

        int have = 0;
        int need = countT.size();

        int l = 0;
        int minLen = Integer.MAX_VALUE;
        int[] minRange = new int[2];

        for (int r = 0; r < s.length(); r++) {
            char ch = s.charAt(r);
            if (!window.containsKey(ch)) {
                window.put(ch, 1);
            } else {
                window.put(ch, window.get(ch) + 1);
            }

            if (countT.containsKey(ch) && countT.get(ch) == window.get(ch)) {
                have += 1;
            }

            while (have == need)  {
                if (minLen > r -  l + 1) {
                    minLen = r - l + 1;
                    minRange[0] = l;
                    minRange[1] = r;
                }
                window.put(s.charAt(l), window.get(s.charAt(l)) - 1 );
                if (countT.containsKey(s.charAt(l)) && countT.get(s.charAt(l)) > window.get(s.charAt(l))) {
                    have --;
                }
                l ++;
            }
        }

        return s.substring(minRange[0], minRange[1] + 1);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        minWindow(s, t);
    }
}
