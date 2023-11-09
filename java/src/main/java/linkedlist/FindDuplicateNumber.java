package linkedlist;

public class FindDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int output = 0;

        int s = 0;
        int f = 0;

        while (true) {
            s = nums[s];
            f = nums[nums[f]];
            if (s == f) break;
        }

        int s2 = 0;
        while (true) {
            s = nums[s];
            s2 = nums[s2];
            if (s == s2) {
                output = s;
                break;
            }
        }

        return output;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        FindDuplicateNumber obj = new FindDuplicateNumber();
        obj.findDuplicate(nums);
    }
}
