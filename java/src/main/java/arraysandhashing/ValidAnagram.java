package arraysandhashing;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> countS = new HashMap<>();
        Map<Character, Integer> countT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!countS.containsKey(s.charAt(i))) {
                countS.put(s.charAt(i), 1);
            } else {
                countS.put(s.charAt(i), countS.get(s.charAt(i)) + 1);
            }

            if (!countT.containsKey(t.charAt(i))) {
                countT.put(t.charAt(i), 1);
            } else {
                countT.put(t.charAt(i), countT.get(t.charAt(i)) + 1);
            }
        }

        for (Map.Entry<Character,Integer> mapElement : countS.entrySet()) {
            if (mapElement.getValue() != countT.get(mapElement.getKey())) {
                return false;
            }
        }
        return true;
    }

    public boolean isAnagramSecond(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] char_counts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char_counts[s.charAt(i) - 'a']++;
            char_counts[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < char_counts.length; i++) {
            if (char_counts[i] != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ValidAnagram obj = new ValidAnagram();
        System.out.println(obj.isAnagram("aa", "bb"));
    }
}
