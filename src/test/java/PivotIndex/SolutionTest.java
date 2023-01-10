package PivotIndex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

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
    void testParametrizedPivotIndexWorksCorrectly (int[] currentArray, int expectedNumber) {
        //given when
        int actualNumber = solution.pivotIndex(currentArray);
        //
        assertEquals(expectedNumber, actualNumber);
    }

    private static Stream<Arguments> predefinedData () {
        return
                Stream.of(
                        Arguments.arguments(new int[]{1,7,3,6,5,6}, 3),
                        Arguments.arguments(new int[]{1, 2, 3}, -1),
                        Arguments.arguments(new int[]{2, -1, 1}, 0)
                );
    }

}
