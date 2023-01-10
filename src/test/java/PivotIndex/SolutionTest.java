package PivotIndex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.Random;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution;

    @BeforeEach
            public void initClassInstance () {
        solution = new Solution();
    }

    @ParameterizedTest (name = "#{index} - Test with arguments currentArray = {0} and expectedIndex {1}")
    @MethodSource("predefinedData")
    void testParametrizedPivotIndexWorksCorrectlyWithoutNullAndCheckingConstraints (int[] currentArray, int expectedNumber) {
        //given when
        int actualNumber = solution.pivotIndex(currentArray);
        //then
        assertEquals(expectedNumber, actualNumber);
    }

    @ParameterizedTest (name = "#{index} - Throw exception for array size {0}")
    @ValueSource (ints = {0,105, 200})
    void testThatExceptionForArraySizeConstrainsWillTrow (int size) {
        //given
        int[] currentArray = createArray(size, 500);
        // when then
        assertThrows(ArrayIndexOutOfBoundsException.class,() -> solution.pivotIndex(currentArray));
    }

    @ParameterizedTest (name = "#{index} - Doesn't throw exception for array size {0}")
    @ValueSource (ints = {1, 20, 56, 104})
    void testThatExceptionForArraySizeConstrainsWillNotTrow (int size) {
        //given
        int[] currentArray = createArray(size, 500);
        // when then
        assertDoesNotThrow(() -> solution.pivotIndex(currentArray));
    }

    @ParameterizedTest (name = "#{index} - Throw exception for array elements max possible absolut value {0}")
    @ValueSource (ints = {1010, 2000, 30000})
    void testThatExceptionForArrayElementsValueConstrainsWillTrow (int maxValue) {
        //given
        int[] currentArray = createArray(100, maxValue);
        // when then
        assertThrows(IllegalArgumentException.class,() -> solution.pivotIndex(currentArray));
    }

    @ParameterizedTest (name = "#{index} - Doesn't throw exception for array size {0}")
    @ValueSource (ints = {2, 20, 200, 1000})
    void testThatExceptionForArrayElementsValueConstrainsWillNotTrow (int maxValue) {
        //given
        int[] currentArray = createArray(100, maxValue);
        // when then
        assertDoesNotThrow(() -> solution.pivotIndex(currentArray));
    }


    private static Stream<Arguments> predefinedData () {
        return
                Stream.of(
                        Arguments.arguments(new int[]{1,7,3,6,5,6}, 3),
                        Arguments.arguments(new int[]{1, 2, 3}, -1),
                        Arguments.arguments(new int[]{2, -1, 1}, 0)
                );
    }

    private int[] createArray (int size, int maxValue) {
        int[] result = new int[size];
        Random rnd = new Random();
        for (int i=0; i<size;i++) {
            result[i] = rnd.nextInt(maxValue) - maxValue;
        }
        return result;
    }

}
