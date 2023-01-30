package medium.longestSubstring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void init () {
        solution = new Solution();
    }

    @ParameterizedTest(name = "#{index} - Test with string \"{0}\" returns length of max substring  {1}")
    @MethodSource("predefinedStringDataForDifferentLetters")
    void testThatGetMaxSubstringLengthReturnLengthOfStringForAllDifferentLetters(String inputString, int expectedLength) {
        //given when
        int actual = solution.getMaxSubstringLength(inputString);
        //then
        assertEquals(expectedLength, actual);
    }

    @ParameterizedTest(name = "#{index} - Test with string \"{0}\" returns length 1")
    @ValueSource(strings = {"p", "ff", "tttttttttttttttt"})
    void testThatGetMaxSubstringLengthReturn1forAllEqualLetters(String inputString) {
        //given when
        int actual = solution.getMaxSubstringLength(inputString);
        //then
        assertEquals(1, actual);
    }

    @ParameterizedTest(name = "#{index} - Test for the first substring with string \"{0}\" returns length of max substring  {1}")
    @MethodSource("predefinedStringDataForFirstSubstring")
    void testThatGetMaxSubstringLengthWorksProperForFirstSubstring(String inputString, int expectedLength) {
        //given when
        int actual = solution.getMaxSubstringLength(inputString);
        //then
        assertEquals(expectedLength, actual);
    }

    @ParameterizedTest(name = "#{index} - Test  with string \"{0}\" returns length of max substring  {1}")
    @MethodSource("predefinedStringData")
    void testThatLengthOfLongestSubstringWorksProper(String inputString, int expectedLength) {
        //given when
        int actual = solution. lengthOfLongestSubstring(inputString);
        //then
        assertEquals(expectedLength, actual);
    }

    private static Stream<Arguments> predefinedStringDataForDifferentLetters () {
        return Stream.of(
                Arguments.arguments("q", 1),
                Arguments.arguments("qf", 2),
                Arguments.arguments("qdfgwr" ,6)
        );
    }

    private static Stream<Arguments> predefinedStringDataForFirstSubstring () {
        return Stream.of(
                Arguments.arguments("qrqttttt", 2),
                Arguments.arguments("qfnqkjsdl", 3),
                Arguments.arguments("qdfgwqr" ,5)
        );
    }

    private static Stream<Arguments> predefinedStringData () {
        return Stream.of(
                Arguments.arguments("qqtiuy", 5),
                Arguments.arguments("qfnqkfn", 4),
                Arguments.arguments("", 0),
                Arguments.arguments("qdfgwqr" ,6)
        );
    }


 }