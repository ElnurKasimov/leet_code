package TransposeMatrix;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution;

    @BeforeEach
    void init() {
        solution = new Solution();
    }

    @ParameterizedTest(name = "#{index} - Test with incorrect lengthArray = {0}")
    @ValueSource(ints = {0, 1001, 2000})
    void testThatArrayLengthLessThan1AndMoreThan1000 (int length) {
        //given
        int[][] inputMatrix = new int[length][5];
        //when then
        Throwable exception = assertThrows(ArrayIndexOutOfBoundsException.class,() -> solution.transpose(inputMatrix));
        assertEquals("Array length is out of allowed value.", exception.getMessage());
    }

}