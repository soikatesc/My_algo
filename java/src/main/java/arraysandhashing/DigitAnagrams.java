package arraysandhashing;

import java.util.*;

public class DigitAnagrams {
    public long digitAnagrams(int[] a) {
        long ans = 0;

        Map<List<Integer>, Integer> map = new HashMap<>();

        for (int n : a) {
            List<Integer> tp = new ArrayList<>();
            while (n > 0) {
                int t = n%10;
                n/=10;
                tp.add(t);
            }
            Collections.sort(tp);
            if (map.containsKey(tp)) {
                ans += map.get(tp);
                map.put(tp, map.get(tp) + 1);
            }else {
                map.put(tp, 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        DigitAnagrams obj = new DigitAnagrams();
        obj.digitAnagrams(new int[] {25, 35, 872, 228, 53, 278, 872});
    }
}
