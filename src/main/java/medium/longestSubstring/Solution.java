package medium.longestSubstring;

//Given a string s, find the length of the longest
//substring without repeating characters.
//Example 1
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.

//Example 2
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.

//Example 3
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

//Constraints:
// 0 <= s.length <= 5 * 104
// s consists of English letters, digits, symbols and spaces.


class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 1;
        for (int i = 0; i < s.length(); i++) {
            int currentMax = getMaxSubstringLength(s.substring(i));
            if (max < currentMax) max = currentMax;
        }
        return s.isEmpty() ? 0 : max;
    }

    public int getMaxSubstringLength(String inputString) {
        int i = 0;
        String temporaryString = "";
        char[] chars = inputString.toCharArray();
        while (i < chars.length && !temporaryString.contains(chars[i] + "")) {
            temporaryString += chars[i];
            i++;
        }
        return i;
    }
}

// BEST solution with HashSet
//public int lengthOfLongestSubstring(String s) {
//    HashSet<Character> set = new HashSet<>();
//    int max = 0;
//    for (int i = 0; i < s.length(); i++) {
//        set.add(s.charAt(i));
//        for (int j = i + 1; j < s.length(); j++) {
//            if (!set.contains(s.charAt(j))) {
//                set.add(s.charAt(j));
//            } else {
//                break;
//            }
//        }
//        if (max < set.size()) {
//            max = set.size();
//        }
//        set.clear();
//    }
//    return max;
//}

//BEST Solution with ASCII codes
//    public int lengthOfLongestSubstring(String s) {
//        int ans = 0;
//        int n = s.length();
//
//        //This variable stores the starting index of the current substring. Initially, it is set to 0.
//        int window = 0;
//
//        /*
//        This array stores the last index at which each character (from ASCII value 32 to 127) was seen.
//        Initially,all the values in the array are set to 0.
//        */
//        int[] idx = new int[96];
//        for (int i = 0; i < n; i++) {
//            /* Converts the current character to its ASCII value, subtracts 32 to shift the range to 0-95,
//            and assigns the value to variable c.*/
//            int c = s.charAt(i) - 32;
//
//            /*
//            Updates the starting index of the current substring. If the current character has been
//            seen before, the starting index is set to the last index at which that character was seen.
//            If the current character has not been seen before, the starting index remains the same.
//            */
//            window = Math.max(idx[c], window);
//
//            /**
//             Updates the length of the longest substring without repeating
//             characters that we have seen so far. The current substring is from window
//             to i+1, so the length of current substring is i-window+1, ans is set to the
//             max of the current length and the previous one.
//             */
//            ans = Math.max(ans , i - window + 1);
//            idx[c] = i + 1;
//        }
//        return ans;
//    }
//}