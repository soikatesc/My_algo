package two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            if (i != 0 && nums[i] == nums[i-1]) continue;

            int pL = i + 1;
            int pR = nums.length - 1;

            while (pL < pR) {
                int sum = nums[i] + nums[pL] + nums[pR];
                if (sum > 0) {
                    pR --;
                } else if (sum < 0) {
                    pL++;
                } else {
                    result.add(Arrays.asList(nums[i], nums[pL], nums[pR]));
                    pL++;
                    while (nums[pL] == nums[pL -1] & pL < pR) {
                        pL++;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        int[] nums = { -2, -2, 0, 0, 2, 2 };
        threeSum.threeSum(nums);
    }
}
