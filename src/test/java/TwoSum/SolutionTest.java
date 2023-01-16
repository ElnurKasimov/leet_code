package TwoSum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static java.lang.Integer.sum;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution;

    @BeforeEach
    void init() {solution = new Solution();
    }


    @Test
    void testThatSumOneAndTwoShouldWork () {
        //given
        int a = 1;
        int b = 2;

        //when
        int actual =  solution.sum(a, b);
        //then
        assertEquals(3, actual);
    }

}