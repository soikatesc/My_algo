package binarysearch;

public class SearchIn2DArray {
    /**
     * T: O(n*m) S: O(1)
     * @param matrix
     * @param targets
     * @return
     */
    public static boolean searchMatrix(int[][] matrix, int target) {
        boolean result = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) return true;
            }
        }
        return result;
    }

    public static boolean searchMatrixOptimized(int[][] matrix, int target) {
        boolean result = false;

        int ROWS = matrix.length;
        int COLUMNS = matrix[0].length;

        int top = 0;
        int bot = ROWS - 1;

        // Find the row that the target is exist
        while (top <= bot) {
            int midRow = (top + bot) / 2;

            if (matrix[midRow][0] > target) {
                bot = midRow - 1;
            } else if (matrix[midRow][COLUMNS - 1] < target) {
                top = midRow + 1;
            } else {
                break;
            }
        }


        // find the value on that row {1, 3, 5, 7}
        int l = 0;
        int r = COLUMNS - 1;

        int row = (top + bot) / 2;
        while (l <= r) {
            int mid = (l + r ) / 2;
            if (matrix[row][mid] == target) return true;
            else if (matrix[row][mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }


        return result;
    }

    public static void main(String[] args) {
        // int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int[][] matrix = {{1}};
        searchMatrixOptimized(matrix, 3);
    }
}
