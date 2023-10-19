package binarysearch;

public class BinarySearch {
    public static int bSearch(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = (right + left) / 2;

            if (nums[mid] == target) return mid;

            if (nums[mid] < target) {
                left = mid + 1;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 5 };
        System.out.println(bSearch(nums, 5));
    }
}
