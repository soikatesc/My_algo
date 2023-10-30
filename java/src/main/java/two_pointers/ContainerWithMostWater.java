package two_pointers;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int n = height.length;
        int output = 0;

        int pl = 0;
        int pr = n - 1;

        while (pl < pr) {
            int currArea = Math.min(height[pl], height[pr]) * (pr - pl);
            if (output < currArea) {
                output = currArea;
            }

            if (height[pl] < height[pr]) {
                pl++;
            } else {
                pr--;
            }
        }

        return output;
    }
    public static void main(String[] args) {
        ContainerWithMostWater obj = new ContainerWithMostWater();
        int[] height = {1,8,6,2,5,4,8,3,7};
        obj.maxArea(height);
    }
}
