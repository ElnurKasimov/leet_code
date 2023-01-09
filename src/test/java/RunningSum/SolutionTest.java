package RunningSum;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @ParameterizedTest(name = "#{index} - Run test with arguments currentArray = {0} and expectedArray = {1}")
    @MethodSource ("predefinedData")
    void testRunningSumParameterizidWorksCorrectly (int[] currentArray, int[] expectedArray){
        //given when
        int[] actualArray = solution.runningSum(currentArray);
        //then
        assertArrayEquals(expectedArray, actualArray);
    }

    static Stream<Arguments> predefinedData () {
        return
                Stream.of(
                        Arguments.arguments(new int[]{0,0,0,0,0},new int[]{0,0,0,0,0}),
                        Arguments.arguments(new int[]{1,2,3,4},new int[]{1,3,6,10}),
                        Arguments.arguments(new int[]{-1,0,1,-1,1},new int[]{-1,-1,0,-1,0})
                );
    }
}