package two_pointers;

public class TrappingRainWater {
    /**
     * T: O(n^2) S: O(1)
     * @param height
     * @return
     */
    public int trap(int[] height) {
        int totalWater = 0;

        int maxL = 0;
        int maxR = 0;

        for (int i = 0; i < height.length; i++) {
            int r = i + 1;
            while (r <= height.length - 1) {
                maxR = Math.max(maxR, height[r]);
                r = r + 1;
            }

            int l = i - 1;
            while (l >= 0) {
                maxL = Math.max(maxL, height[l]);
                l = l - 1;
            }

            int currWater = Math.min(maxL, maxR) - height[i];
            if (currWater >= 0) {
                totalWater  += currWater;
            }

            maxL = 0;
            maxR = 0;
        }

        return totalWater;
    }

    /**
     * T: O(n) S: O(1)
     * @param height
     * @return
     */
    public int trapOptimize(int[] height) {
        int totalWater = 0;

        int maxLeft = 0;
        int maxRight = 0;

        int pl = 0;
        int pr = height.length - 1;

        while (pl < pr) {
            if (height[pl] <= height[pr]) {
                if (maxLeft > height[pl]) {
                    totalWater += maxLeft - height[pl];
                } else {
                    maxLeft = height[pl];
                }
                pl++;
            } else {
                if (maxRight > height[pr]) {
                    totalWater += maxRight - height[pr];
                } else {
                    maxRight = height[pr];
                }
                pr --;
            }
        }

        return totalWater;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        TrappingRainWater obj = new TrappingRainWater();
        // obj.trap(height);
        int[] height2 = {0,1,0,2,1,0,3,1,0,1,2};
        obj.trapOptimize(height2);
    }
}
