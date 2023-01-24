package TransposeMatrix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;


class SolutionTest {
    Solution solution;

    @BeforeEach
    void init() {
        solution = new Solution();
    }

    @ExtendWith(MockitoExtension.class)

    @ParameterizedTest(name = "#{index} - Test with correct lengthMatrix = {0}")
    @ValueSource(ints = {1, 2, 1000, 500})
    void testThatWhenArrayLengthFromOneToOneThousandDoesNotTrowException (int length) {
        //given
        int [][] inputMatrix = new int[length][5];
        //when
        solution.transpose(inputMatrix);
      //then
        assertDoesNotThrow(() -> solution.transpose(inputMatrix));
    }

    @ParameterizedTest(name = "#{index} - Test with lengthMatrix = {0}")
    @ValueSource(ints = {0, 1001, 2000})
    void testThatWhenArrayLengthZeroOrMoreThanOneThousandTrowsException (int length) {
        //given
        int [][] inputMatrix = new int[length][5];
        //when
        try {
            solution.transpose(inputMatrix);
        } catch (ArrayIndexOutOfBoundsException ex) {
            // Then
            assertThrows(ArrayIndexOutOfBoundsException.class, () -> solution.transpose(inputMatrix));
        }
    }

    @ParameterizedTest(name = "#{index} - Test with correct lengthMatrix = {0}")
    @ValueSource(ints = {1, 5, 500, 1000})
    void testThatWhenArrayRowLengthFromOneToOneThousandDoesNotTrowException (int length) {
        //given
        int [][] inputMatrix = new int[3][length];
        //when
        solution.transpose(inputMatrix);
        //then
        assertDoesNotThrow(() -> solution.transpose(inputMatrix));
    }

    @ParameterizedTest(name = "#{index} - Test with lengthMatrix = {0}")
    @ValueSource(ints = {0, 1001, 2000})
    void testThatWhenArrayRowLengthZeroOrMoreThanOneThousandTrowsException (int length) {
        //given
        int [][] inputMatrix = new int[3][length];
        //when
        try {
            solution.transpose(inputMatrix);
        } catch (ArrayIndexOutOfBoundsException ex) {
            // Then
            assertThrows(ArrayIndexOutOfBoundsException.class, () -> solution.transpose(inputMatrix));
        }
    }

    @ParameterizedTest(name = "#{index} - Test with Matrixlength = {0} and MatrixRowLength = {1} " +
            "throws exceptions")
    @MethodSource("predefinedWrongMatrixDimensionsData")
    void testThatWhenArrayDimensionsProductLessThenOneOrMoreThan105TrowsException (int arrayLength, int arrayRowLength) {
        //given
        int [][] inputMatrix = new int[arrayLength][arrayRowLength];
        //when
        try {
            solution.transpose(inputMatrix);
        } catch (IllegalArgumentException ex) {
            // Then
            assertThrows(IllegalArgumentException.class, () -> solution.transpose(inputMatrix));
        }
    }

    @ParameterizedTest(name = "#{index} - Test that matrix symmetric: with Matrixlength = {0} and MatrixRowLength = {1} " +
            "doesn't throw exceptions")
    @MethodSource("predefinedMatrixDimensionsData")
    void testThatMatrixSymmetric (int arrayLength, int arrayRowLength) {
        //given
        int [][] inputMatrix = new int[arrayLength][arrayRowLength];
        //when
        solution.transpose(inputMatrix);
        assertDoesNotThrow(() -> solution.transpose(inputMatrix));
    }


    @ParameterizedTest(name = "#{index} - Test with matrix = {0} throws exceptions for its element")
    @MethodSource("predefinedWrongMatrixElementData")
    void testThatWhenMatrixElementAbsoluteValueMoreThan109ThenTrowsException (int[][] matrix) {
        //given when
        try {
            solution.transpose(matrix);
        } catch (IllegalArgumentException ex) {
            //then
            assertThrows(IllegalArgumentException.class, () -> solution.transpose(matrix));
        }
    }

    @ParameterizedTest(name = "#{index} - Test with matrix = {0}  doesn't throw exceptions for its element")
    @MethodSource("predefinedMatrixElementData")
    void testThatWhenMatrixElementAbsoluteValueLessThan110ThenDoesNotTrowException (int[][] matrix) {
        //given when
        solution.transpose(matrix);
        //then
        assertDoesNotThrow(() -> solution.transpose(matrix));

    }


    private static Stream<Arguments> predefinedWrongMatrixDimensionsData() {
        return
                Stream.of(
                        Arguments.arguments(106,1),
                        Arguments.arguments(1,106),
                        Arguments.arguments(20,15),
                        Arguments.arguments(11, 11)
                );
    }

    private static Stream<Arguments> predefinedMatrixDimensionsData() {
        return
                Stream.of(
                        Arguments.arguments(105,1),
                        Arguments.arguments(1,105),
                        Arguments.arguments(5,20),
                        Arguments.arguments(10, 10)
                );
    }

    private static Stream<Arguments> predefinedWrongMatrixElementData() {
        return
                Stream.of(
                        Arguments.arguments((Object) new int [][] {{1,2}, {110, 5}}),
                        Arguments.arguments((Object) new int [][] {{-110,5,-2}, {-110,0,5}, {-10,120,5}}),
                        Arguments.arguments((Object) new int [][] {{10,-200}, {100, 5}})
                );
    }
    private static Stream<Arguments> predefinedMatrixElementData() {
        return
                Stream.of(
                        Arguments.arguments((Object) new int [][] {{1,2}, {109, 5}}),
                        Arguments.arguments((Object) new int [][] {{-109,5,-2}, {-89,0,5}, {-10,109,5}}),
                        Arguments.arguments((Object) new int [][] {{-10,-109}, {100, 5}})
                );
    }

}