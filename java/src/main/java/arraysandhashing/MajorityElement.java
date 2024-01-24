package arraysandhashing;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int output = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                int currCount = map.get(nums[i]) + 1;
                map.put(nums[i], currCount);
                if (currCount > (nums.length / 2)) return nums[i];
            }
        }

        return output;
    }

    public static int majorityElementOptimized(int[] nums) {
        int res = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (res == nums[i]) {
                count++;
            } else if (count == 0) {
                res = nums[i];
                count++;
            } else {
                count --;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 2,2,1,1,1,2,2 };
        int[] nums2 = { 3, 2, 3};
        int[] nums3 = { 1,3,1,1,4,1,1,5,1,1,6,2,2 };
        // majorityElement(nums);
        majorityElementOptimized(nums3);
    }
}
