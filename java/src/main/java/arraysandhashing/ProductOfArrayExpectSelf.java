package arraysandhashing;

public class ProductOfArrayExpectSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix;
            prefix = nums[i] * prefix;
        }

        int suffix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = suffix * result[i];
            suffix = nums[i] * suffix;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        ProductOfArrayExpectSelf obj = new ProductOfArrayExpectSelf();
        obj.productExceptSelf(nums);
    }
}
