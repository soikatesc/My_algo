package arraysandhashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKElement {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        List<List<Integer>> result = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result.get(entry.getValue()).add(entry.getKey());
        }

        List<Integer> topKElement = new ArrayList<>();
        for (int i = result.size() - 1; i >= 0; i--) {
            if (topKElement.size() == k) break;

            List<Integer> freq = result.get(i);

            int j = 0;
            while (j < freq.size()) {
                topKElement.add(freq.get(j));
                j++;
            }
        }

        int[] output = new int[k];
        for (int i = 0; i < output.length; i++) {
            output[i] = topKElement.get(i);
        }

        return output;
    }

    public static void main(String[] args) {
        TopKElement obj = new TopKElement();
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        obj.topKFrequent(nums, k);
    }
}
