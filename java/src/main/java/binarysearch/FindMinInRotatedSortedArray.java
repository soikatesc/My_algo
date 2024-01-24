package binarysearch;

public class FindMinInRotatedSortedArray {
    public static int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;

        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[l] <= nums[mid]) {
                min = Math.min(min, nums[l]);
                l = mid + 1;
            } else {
                r = mid - 1;
                min = Math.min(min, nums[mid]);
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,1,2,3};
        findMin(nums);
    }
}
