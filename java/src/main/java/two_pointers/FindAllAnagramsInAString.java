package two_pointers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsInAString {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> output = new ArrayList<>();
        Map<Character, Integer> mapP = new HashMap<>();
        Map<Character, Integer> mapS = new HashMap<>();

        if (p.length() > s.length()) return output;

        for (int i = 0; i < p.length(); i++) {
            mapP.put(p.charAt(i), 1 + mapP.getOrDefault(s.charAt(i), 0));
            mapS.put(s.charAt(i), 1 + mapS.getOrDefault(s.charAt(i), 0));
        }

        if (mapP.equals(mapS)) {
            output.add(0);
        }

        int l = 0;
        for (int r = p.length(); r < s.length(); r++) {
            if (!mapS.containsKey(s.charAt(r))) {
                mapS.put(s.charAt(r), 1);
            } else {
                mapS.put(s.charAt(r), mapS.get(s.charAt(r)) + 1);
            }

            mapS.put(s.charAt(l), mapS.get(s.charAt(l)) - 1);

            if (mapS.get(s.charAt(l)) == 0) {
                mapS.remove(s.charAt(l));
            }

            if (mapS.equals(mapP)) {
                output.add(l+1);
            }
            l++;
        }

        return output;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        findAnagrams(s, p);
    }
}
