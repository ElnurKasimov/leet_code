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
        String temporaryString = "";
        int i = 0;
        char[] chars = inputString.toCharArray();
        while (i < chars.length && !temporaryString.contains(chars[i] + "")) {
            temporaryString += chars[i];
            i++;
        }
        return i;
    }
}

// BEST solution
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
