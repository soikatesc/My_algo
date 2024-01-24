package matchandgeometry;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
    /**
     * T: O(m * n)
     * S: O(1)
     * @param matrix
     * @return
     */
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> output = new ArrayList<>();

        int left = 0;
        int right = matrix[0].length;
        int top = 0;
        int bottom = matrix.length;

        while (left < right && top < bottom) {
            for (int i = left; i < right; i++) {
                output.add(matrix[top][i]);
            }

            top += 1;

            for (int i = top; i < bottom; i++) {
                output.add(matrix[i][right - 1]);
            }

            right -= 1;

            if (!(left < right && top < bottom)) {
                break;
            }

            for (int i = right - 1; i >= left; i--) {
                output.add(matrix[bottom - 1][i]);
            }

            bottom --;

            for (int i = bottom - 1; i >= top; i--) {
                output.add(matrix[i][left]);
            }

            left ++;
        }

        return output;
    }

    public static void main(String[] args) {
        int[][] matrix = { {1, 2, 3}};
        SpiralOrder spiralOrder = new SpiralOrder();
        spiralOrder.spiralOrder(matrix);
    }
}
