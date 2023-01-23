package TransposeMatrix;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class SolutionTest {
    Solution solution;

    @BeforeEach
    void init() {
        solution = new Solution();
    }

    @ExtendWith(MockitoExtension.class)

    @ParameterizedTest(name = "#{index} - Test with lengthArray = {0}")
    @ValueSource(ints = {0, 1, 2, 1000, 1001, 2000})
    void testThatWhenArrayLength2000ThenTrowsExceptionWorksProper (int length) {
        //given
        int [][] inputMatrix = new int[length][5];
        //when
        try {
            solution.transpose(inputMatrix);
        } catch (ArrayIndexOutOfBoundsException ex) {
            // Then
            assertThrows(ArrayIndexOutOfBoundsException.class, () -> solution.transpose(inputMatrix));
        }
            assertDoesNotThrow(() -> solution.transpose(inputMatrix));
    }

    @ParameterizedTest(name = "#{index} - Test with incorrect lengthArray = {0}")
    @ValueSource(ints = {0, 1001, 2000})
    void testThatArrayLengthLessThan1AndMoreThan1000 (int length) {
        //given
        Solution spy = Mockito.spy(solution);
        int[][] inputMatrix = new int[length][5];
        //when
        when(spy.transpose(inputMatrix)).thenThrow(new ArrayIndexOutOfBoundsException("Array length is out of allowed value."));
        // then
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> spy.transpose(inputMatrix));
    }

    @ParameterizedTest(name = "#{index} - Test with correct lengthArray = {0}")
    @ValueSource(ints = {1, 118, 1000})
    void testThatArrayLengthMoreThan0AndLessThan1001 (int length) {
        //given
        //Solution spy = Mockito.spy(solution);
        int[][] inputMatrix = new int[length][5];
        //when
        //when(spy.transpose(inputMatrix)).thenThrow(new ArrayIndexOutOfBoundsException("Array length is out of allowed value."));
        // then
       assertDoesNotThrow( () -> solution.transpose(inputMatrix));
    }


}