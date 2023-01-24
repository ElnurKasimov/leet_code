package TransposeMatrix;
//Given a 2D integer array matrix, return the transpose of matrix.
//The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
//Example 1:
//nput: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [[1,4,7],[2,5,8],[3,6,9]]
//Constraints:
//m == matrix.length
//n == matrix[i].length
//1 <= m, n <= 1000
//1 <= m * n <= 105
// -109 <= matrix[i][j] <= 109


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
            for (int i=0; i<inputMatrix.length; i++) {
                if (inputMatrix[i].length < MIN_MATRIX_I_LENGTH || inputMatrix[i].length > MAX_MATRIX_I_LENGTH) {
                    throw new ArrayIndexOutOfBoundsException("Matrix row length is out of allowed value.");
                }
            }
            for (int i=0; i<inputMatrix.length; i++) {
                int product = inputMatrix.length * inputMatrix[i].length;
                if ( product < MIN_PRODUCT_MATRIX_DIMENSIONS || product > MAX_PRODUCT_MATRIX_DIMENSIONS) {
                    throw new IllegalArgumentException("Product matrix dimensions is out of allowed value.");
                }
            }
            for (int i=0; i<inputMatrix.length; i++) {
                if(inputMatrix.length != inputMatrix[i].length){
                    throw new IllegalArgumentException("Matrix has to be symmetric.");
                }
            }
            for (int i=0; i<inputMatrix.length; i++) {
                for (int j = 0; j < inputMatrix[i].length; j++) {
                    if (inputMatrix[i][j] < -1 * MAX_ABSOLUTE_VALUE || inputMatrix[i][j] > MAX_ABSOLUTE_VALUE) {
                        throw new IllegalArgumentException("Matrix element is out of allowed value.");
                    }
                }
            }
        } catch (RuntimeException ex) {
            ex.printStackTrace();
        }
    return new int[2][2];
    }
}
