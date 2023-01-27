package easy.TwoSum;

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.
//Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Constraints:
//2 <= nums.length <= 104
//-109 <= nums[i] <= 109
//-109 <= target <= 109
//Only one valid answer exists.



class Solution {
    private static final int MIN_TARGET = -109;
    private static final int MAX_TARGET = 109;
    private static final int MIN_ARRAY_LENGTH = 2;
    private static final int MAX_ARRAY_LENGTH = 104;
    private static final int MIN_CONTENT = -109;
    private static final int MAX_CONTENT = 109;

    public int[] twoSum(int[] nums, int target) throws IllegalArgumentException, ArrayIndexOutOfBoundsException {
        try {
            if (target < MIN_TARGET || target > MAX_TARGET) {
                throw new IllegalArgumentException("Target is out of allowed value.");
            }
            if (nums.length < MIN_ARRAY_LENGTH || nums.length > MAX_ARRAY_LENGTH) {
            throw new ArrayIndexOutOfBoundsException("Array length is out of allowed value.");
            }
            for (int num : nums) {
                    if (num < MIN_CONTENT || num > MAX_CONTENT) {
                        throw new IllegalArgumentException("Array element  is out of allowed value.");
                    }
           }
        } catch (RuntimeException ex) {
            ex.printStackTrace();
        }
        int[] result = {0,0};
        for (int i=0; i<nums.length-1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (sum(nums[i], nums[j]) == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }

    public int sum (int a, int b) {return a+b;}

}