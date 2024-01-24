package arraysandhashing;

import java.util.HashMap;
import java.util.Map;

public class ContinousSubarraySum {
    public static boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            int reminder = sum % k;

            if (!map.containsKey(reminder)) {
                map.put(reminder, i);
            } else {
                if (i - map.get(reminder) >= 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {23,2,4,6,7};
        int k = 6;
        checkSubarraySum(nums, k);
    }
}
