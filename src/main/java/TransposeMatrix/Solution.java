package TransposeMatrix;
//Given a 2D integer array matrix, return the transpose of matrix.
//The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
//Example 1:
//input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [[1,4,7],[2,5,8],[3,6,9]]
//Constraints:
//m == matrix.length
//n == matrix[i].length
//1 <= m, n <= 1000
//1 <= m * n <= 105
// -109 <= matrix[i][j] <= 109


import java.sql.SQLOutput;
import java.util.Arrays;

class Solution {
    private static final int MIN_MATRIX_LENGTH = 1;
    private static final int MIN_MATRIX_I_LENGTH = 1;
    private static final int MAX_MATRIX_LENGTH = 1000;
    private static final int MAX_MATRIX_I_LENGTH = 1000;
    private static final int MIN_PRODUCT_MATRIX_DIMENSIONS = 1;
    private static final int MAX_PRODUCT_MATRIX_DIMENSIONS = 105;
    private static final int MAX_ABSOLUTE_VALUE = 109;

    public int[][] transpose(int[][] inputMatrix) {
        try {
            if (inputMatrix.length < MIN_MATRIX_LENGTH || inputMatrix.length > MAX_MATRIX_LENGTH) {
                throw new ArrayIndexOutOfBoundsException("Matrix length is out of allowed value.");
            }
            for (int[] value : inputMatrix) {
                if (value.length < MIN_MATRIX_I_LENGTH || value.length > MAX_MATRIX_I_LENGTH) {
                    throw new ArrayIndexOutOfBoundsException("Matrix row length is out of allowed value.");
                }
            }
            for (int[] ints : inputMatrix) {
                int product = inputMatrix.length * ints.length;
                if (product < MIN_PRODUCT_MATRIX_DIMENSIONS || product > MAX_PRODUCT_MATRIX_DIMENSIONS) {
                    throw new IllegalArgumentException("Product matrix dimensions is out of allowed value.");
                }
            }
            for (int[] matrix : inputMatrix) {
                for (int i : matrix) {
                    if (i < -1 * MAX_ABSOLUTE_VALUE || i > MAX_ABSOLUTE_VALUE) {
                        throw new IllegalArgumentException("Matrix element is out of allowed value.");
                    }
                }
            }
        } catch (RuntimeException ex) {
            ex.printStackTrace();
        }
        int[][] outputMatrix = new int[inputMatrix[0].length][inputMatrix.length];
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[i].length; j++) {
                outputMatrix[j][i] = inputMatrix[i][j];
            }

        }
        return outputMatrix;
    }

//    public static void main(String[] args) {
//        int[][] test = new int[][]{{1,2,3}, {4, 5, 6}};
//        System.out.println(Arrays.deepToString(test));
//        System.out.println(Arrays.deepToString(transpose(test)));
//    }
}
