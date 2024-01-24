package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindownSubString {
    public static String minWindow(String s, String t) {
        if (t.isEmpty()) return "";

        Map<Character, Integer> countT = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!countT.containsKey(c)) {
                countT.put(c, 1);
            } else {
                countT.put(c, countT.get(t.charAt(i)) + 1);
            }
        }

        int have = 0;
        int need = countT.size();

        int l = 0;
        int resLen = Integer.MAX_VALUE;
        int[] minWindow = new int[2];

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            if (!window.containsKey(c)) {
                window.put(c, 1);
            } else {
                window.put(c, window.get(c) + 1);
            }

            if (countT.containsKey(c) && window.get(c) == countT.get(c)) {
                have += 1;
            }

            while (have == need) {
                if ((r - l + 1) < resLen){
                    resLen = r - l + 1;
                    minWindow[0] = l;
                    minWindow[1] = r;
                }
                window.put(s.charAt(l), window.get(s.charAt(l)) - 1);
                if (countT.containsKey(s.charAt(l)) && window.get(s.charAt(l)) < countT.get(s.charAt(l))) {
                    have -= 1;
                }
                l += 1;
            }
        }

        return resLen == Integer.MAX_VALUE ? "" : s.substring(minWindow[0], minWindow[1] + 1);
    }

    public static void main(String[] args) {
        String s = "aa";
        String t = "aa";
        minWindow(s, t);
    }
}
