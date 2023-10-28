package two_pointers;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int pL = 0;
        int pR = numbers.length - 1;

        while (pL < pR) {
            int sum = numbers[pL] + numbers[pR];
            if (sum == target) {
                return new int[] {pL + 1, pR + 1};
            }

            if (sum > target) {
                pR--;
            } else {
                pL++;
            }
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        TwoSumII obj = new TwoSumII();
        int[] numbers = {2,7,11,15};
        int target = 9;
        obj.twoSum(numbers, target);
    }
}
