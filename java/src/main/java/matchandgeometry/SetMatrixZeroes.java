package matchandgeometry;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int[][] copyMatrix = new int[matrix.length][matrix[0].length];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                copyMatrix[row][col] = matrix[row][col];
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (copyMatrix[row][col] == 0) {
                    setZersoInner(matrix, row, col);
                }
            }
        }
    }

    void setZersoInner(int[][] matrix, int row, int col) {
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[row][i] = 0;
        }

        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
    }

    /*
    T: O (m * n)
    S: O(m + n)
     */
    public void setZeros2ndMethod(int[][] matrix) {
        int[] rowH = new int[matrix.length];
        int[] colH = new int[matrix[0].length];

        for (int i = 0; i < rowH.length; i++) {
            rowH[i] = -1;
        }

        for (int i = 0; i < colH.length; i++) {
            colH[i] = -1;
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] == 0) {
                    rowH[row] = 0;
                    colH[col] = 0;
                }
            }
        }

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if (rowH[r] == 0 || colH[c] == 0) {
                    matrix[r][c] = 0;
                }
            }
        }
    }

    /*
        T: O (m * n)
        S: O(1)
     */
    public void setZerosWithNoExtraMemory(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean rowZero = false;

        // determine which rows and cols need to be zero
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (matrix[r][c] == 0) {
                    matrix[0][c] = 0;

                    if (r > 0) {
                        matrix[r][0] = 0;
                    } else {
                        rowZero = true;
                    }
                }
            }
        }

        for (int r = 1; r < rows; r++) {
            for (int c = 1; c < cols; c++) {
                if (matrix[0][c] == 0 || matrix[r][0] == 0) {
                    matrix[r][c] = 0;
                }
            }
        }

        if (matrix[0][0] == 0) {
            for (int r = 0; r < rows; r++) {
                matrix[r][0] = 0;
            }
        }

        if (rowZero) {
            for (int c = 0; c < cols; c++) {
                matrix[0][c] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        SetMatrixZeroes setMatrixZeroes = new SetMatrixZeroes();
        setMatrixZeroes.setZeros2ndMethod(matrix);
    }
}
