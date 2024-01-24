package arraysandhashing;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longest = 0;

        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i] - 1)) {
                int currLength = 1;
                while (set.contains(nums[i] + currLength)) {
                    currLength += 1;
                }

                longest = Math.max(longest, currLength);
            }
        }

        return longest;
    }
    public static void main(String[] args) {
        int[] nums = { 100,4,200,1,3,2 };
        LongestConsecutiveSequence obj = new LongestConsecutiveSequence();
        obj.longestConsecutive(nums);
    }
}
