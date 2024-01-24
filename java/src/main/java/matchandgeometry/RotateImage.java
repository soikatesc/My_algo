package matchandgeometry;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int left = 0;
        int right = matrix[0].length - 1;

        while (left < right) {
            for (int i = 0; i < right - left; i++) {
                int top = left;
                int bottom = right;

                // save top left value
                int topLeft = matrix[top][left + i];

                // move bottom left into top left
                matrix[top][left + i] = matrix[bottom - i][left];

                // move bottom right into bottom left
                matrix[bottom - i][left] = matrix[bottom][right - i];

                // move top right into bottom right
                matrix[bottom][right - i] = matrix[top + i][right];

                // move top left into top right
                matrix[top + i][right] = topLeft;
            }

            left ++;
            right --;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { {1,2,3}, {4,5,6}, {7,8,9} };
        RotateImage obj = new RotateImage();
        obj.rotate(matrix);
    }
}
