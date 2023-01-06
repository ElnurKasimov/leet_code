package RunningSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void testThatRunningSumZeroWorksCorrectly (){
        //given
        int [] currentArray = {0,0,0,0,0};
        //when
        int[] actualArray = solution.runningSum(currentArray);
        //then
        int[] expectedArray = {0,0,0,0,0};
        assertArrayEquals(expectedArray, actualArray);
    }

}