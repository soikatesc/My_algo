package binarysearch;

public class MedianOfTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double output = 0;

        if (nums2.length < nums1.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        int total = nums1.length + nums2.length;
        int half = total / 2;

        int l = 0;
        int r = nums1.length - 1;

        while (true) {
            int mid = l + (r - l) / 2;
            int j = half - mid;

            int nums1Left = mid >=0 ? nums1[mid - 1] : Integer.MIN_VALUE;
            int nums1Right = (mid + 1) < nums1.length ? nums1[mid + 1] : Integer.MAX_VALUE;

            int nums2Left = j >=0 ? nums2[j] : Integer.MIN_VALUE;
            int nums2Right = (j + 1) < nums2.length ? nums2[j + 1] : Integer.MAX_VALUE;

            if (nums1Left < nums2Right && nums1Right > nums2Left) {
                if (total % 2 == 0) {
                    output = (Math.max(nums1Left, nums2Left) + Math.min(nums1Right, nums2Right)) /2;
                } else {
                    output = Math.min(nums1Right, nums2Right);
                }
                break;
            } else if (nums1Left > nums2Right) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return output;
    }

    public static void main(String[] args) {
//        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8};
//        int[] nums2 = {1, 2, 3, 4, 5};
        int[] nums1 = {1,3};
        int[] nums2 = {2};

        MedianOfTwoSortedArray obj = new MedianOfTwoSortedArray();
        obj.findMedianSortedArrays(nums1, nums2);
    }
}
