package TwoSum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

class SolutionTest {
    Solution solution;

    @ExtendWith(MockitoExtension.class)


    @BeforeEach
    void init() {solution = new Solution();
    }


    @Test
    void testThatSumOneAndTwoShouldNotWork () {
        //given
        int a = 2;
        int b = 2;
        //when
        int actual =  solution.sum(a, b);
        //then
        assertNotEquals(3, actual);
    }

    @ParameterizedTest(name = "#{index} - Test with arguments currentArray = {0} and expectedSum {1}")
    @MethodSource("predefinedSumData")
    void testParametrizedSumWorksCorrectly (int[] currentArray, int expectedSum) {
        //given when
        int actualSum = solution.sum(currentArray[0], currentArray[1]);
        //then
        assertEquals(expectedSum, actualSum);
    }

    @Captor
    ArgumentCaptor<int[]> arrayCaptor;
    ArgumentCaptor<Integer> intCaptor;

    @ParameterizedTest(name = "#{index} - Test with incorrect lengthArray = {0}")
    @ValueSource(ints = {1, 105, 200})
    void testThatParametrizedArgumentArrayLengthLessThan2AndMoreThan104 (int length) {
        //given
        int[] nums = new int[length];
        //when then
        assertThrows(ArrayIndexOutOfBoundsException.class,() -> solution.twoSum(nums, 30));

    }
    @ParameterizedTest(name = "#{index} - Test with lengthArray = {0}")
    @ValueSource(ints = {2, 5, 50, 104})
    void testThatParametrizedArgumentArrayLengthMoreThanOneAndLessThan105 (int length) {
        //given
        int[] nums = new int[length];
        //when then
       assertDoesNotThrow(()-> solution.twoSum(nums, 30));

    }

    @ParameterizedTest(name = "#{index} - Test with incorrect targetValue = {0}")
    @ValueSource(ints = {-200, -110, 110, 500})
    void testThatParametrizedTwoSumAbsoluteValueTargetMoreThan110 (int value) {
        //given
        int[] nums = new int[20];
        //when then
        assertThrows(IllegalArgumentException.class, () -> solution.twoSum(nums, value));
    }
    @ParameterizedTest(name = "#{index} - Test with correct targetValue = {0}")
    @ValueSource(ints = {-109, -5, 0, 65, 109})
    void testThatParametrizedTwoSumAbsoluteValueTargetLessThan110 (int value) {
        //given
        int[] nums = new int[20];
        //when then
        assertDoesNotThrow(() -> solution.twoSum(nums, value));
    }

    private static Stream<Arguments> predefinedSumData() {
        return
                Stream.of(
                        Arguments.arguments(new int[]{1,0}, 1),
                        Arguments.arguments(new int[]{-5, 3}, -2),
                        Arguments.arguments(new int[]{-1, 1}, 0)
                );
    }

    private int[] prepareArray(int length) {
        return new int[length];
    }

}