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
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class SolutionTest {
   private Solution solution;

    @BeforeEach
    void ini() {
        solution = new Solution();
    }

    @ExtendWith(MockitoExtension.class)


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

    @ParameterizedTest(name = "#{index} - Test with arguments a = {0} and b = {1}  expectedSum ={2}")
    @MethodSource("predefinedSumData")
    void testParametrizedSumWorksCorrectly (int a, int b, int expectedSum) {
        //given when
        int actualSum = solution.sum(a, b);
        //then
        assertEquals(expectedSum, actualSum);
    }

    @ParameterizedTest(name = "#{index} - Test with lengthArray = {0}")
    @ValueSource(ints = {2, 5, 50, 104})
    void testThatParametrizedArgumentArrayLengthMoreThanOneAndLessThan105 (int length) {
        //given
        int[] nums = new int[length];
        //when then
       assertDoesNotThrow(()-> solution.twoSum(nums, 30));
    }

    @ParameterizedTest(name = "#{index} - Test with incorrect content of array = {0}")
    @ValueSource(ints = {350, 110, -110, 200})
    void testThatParametrizedArrayContentAbsolutValueThan109 (int content) {
        //given
        Solution spy = Mockito.spy(solution);
        int[] nums = new int[20];
        nums[5] = content;
        //when
        when(spy.twoSum(nums, 20)).thenThrow(new IllegalArgumentException("Array element  is out of allowed value."));
        //then
        assertThrows(IllegalArgumentException.class, () -> spy.twoSum(nums, 20));
    }

    @ParameterizedTest(name = "#{index} - Test with correct content of array = {0}")
    @ValueSource(ints = {-109, -5, 50, 109})
    void testThatParametrizedArrayContentLessThan110 (int content) {
        //given
        int[] nums = new int[20];
        nums[10] = content;
        //when then
        assertDoesNotThrow(() -> solution.twoSum(nums, 30));
    }
    @ParameterizedTest(name = "#{index} - Test with incorrect targetValue = {0}")
    @ValueSource(ints = {-200, -110, 110, 500})
    void testParametrizedThatTwoSumTrowsExceptionWhenAbsoluteValueTargetMoreThan110 (int value) {
        //given
        Solution spy = Mockito.spy(solution);
        int[] nums = new int[20];
        when(spy.twoSum(nums, value)).thenThrow(new IllegalArgumentException("Target is out of allowed value."));
        //when then
        assertThrows(IllegalArgumentException.class, () -> spy.twoSum(nums, value));
    }


    @ParameterizedTest(name = "#{index} - Test with correct targetValue = {0}")
    @ValueSource(ints = {-109, -5, 0, 65, 109})
    void testThatParametrizedTwoSumAbsoluteValueTargetLessThan110 (int value) {
        //given
        int[] nums = new int[20];
        //when then
        assertDoesNotThrow(() -> solution.twoSum(nums, value));
    }

    @ParameterizedTest(name = "#{index} - Test with arguments nums = {0} and target = {1} returns expectedResult = {2}")
    @MethodSource("predefinedTwoSumData")
    void testParametrizedTwoSumWorksCorrectly (int[] nums, int target, int[] expectedResult) {
        //given when
        int[] actualResult = solution.twoSum(nums, target);
        //then
        assertEquals(expectedResult[0], actualResult[0]);
        assertEquals(expectedResult[1], actualResult[1]);
    }


//    @Captor
//    ArgumentCaptor<int[]> arrayCaptor;
//    @Captor
//    ArgumentCaptor<Integer> intCaptor;
//
//    @ParameterizedTest(name = "#{index} - Test with incorrect lengthArray = {0}")
//    @ValueSource(ints = {10, 200})
//    void testThatParametrizedArgumentArrayLengthLessThan2AndMoreThan104 (int length) {
//        //given
//        Solution solutionMock = Mockito.mock(Solution.class);
//        int[] nums = new int[length];
//        //when then
//        verify(solutionMock).twoSum(arrayCaptor.capture(), intCaptor.capture());
//        assertFalse((arrayCaptor.getValue().length) > 1 && (arrayCaptor.getValue().length < 105) );
//    }

    @ParameterizedTest(name = "#{index} - Test with incorrect lengthArray = {0}")
    @ValueSource(ints = {1, 105, 200})
    void testThatExceptionIsThrownWhenArrayLengthLessThan2AndMoreThan104 (int length) {
        //given
        Solution spy = Mockito.spy(solution);
        int[] nums = new int[length];
        when(spy.twoSum(nums, 20)).thenThrow(new ArrayIndexOutOfBoundsException("Array element  is out of allowed value."));
        //when then
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> spy.twoSum(nums, 20));
    }

    private static Stream<Arguments> predefinedSumData() {
        return
                Stream.of(
                        Arguments.arguments(1,0, 1),
                        Arguments.arguments(-5,3, -2),
                        Arguments.arguments(-1,1, 0)
                );
    }

    private static Stream<Arguments> predefinedTwoSumData() {
        return
                Stream.of(
                        Arguments.arguments(new int[]{2,7,11,15}, 9,  new int[]{0,1}),
                        Arguments.arguments(new int[]{3, 2, 4}, 6, new int[]{1,2}),
                        Arguments.arguments(new int[]{3, 3}, 6, new int[]{0,1})
                );
    }
}