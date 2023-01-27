package easy.PivotIndex;

import java.util.Arrays;
import java.util.Random;

//Given an array of integers nums, calculate the pivot index of this array.
//The pivot index is the index where the sum of all the numbers strictly to the left of the index
// is equal to the sum of all the numbers strictly to the index's right.
//If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left.
// This also applies to the right edge of the array.
//Return the leftmost pivot index. If no such index exists, return -1.

//Constraints:
// 1 <= nums.length <= 104
//-1000 <= nums[i] <= 1000

//Example 1:
//Input: nums = [1,7,3,6,5,6]
//Output: 3
//Explanation:
//The pivot index is 3.
//Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
//Right sum = nums[4] + nums[5] = 5 + 6 = 11

public class Solution {
    private static final int MAX_ARRAY_SIZE = 104;
    private static final int MIN_ARRAY_SIZE = 1;
    private static final int MAX_VALUE = 1000;
    private static final int MIN_VALUE = -1000;
    public int pivotIndex(int[] nums) {

        if(nums.length < MIN_ARRAY_SIZE || nums.length > MAX_ARRAY_SIZE) {
            throw new ArrayIndexOutOfBoundsException("Array size more than " + MAX_ARRAY_SIZE + " or less than " + MIN_ARRAY_SIZE);
        }
        //noinspection ForLoopReplaceableByForEach
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < MIN_VALUE || nums[i] > MAX_VALUE) {
                throw new IllegalArgumentException("Value of array element more than " + MAX_VALUE + " or less than " + MIN_VALUE);
            }
        }

        int result=-1;
        int sumLeft = 0;
        int sumRight = Arrays.stream(nums).sum() - nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (sumLeft == sumRight) {
                result = i;
                break;}
            sumLeft+=nums[i];
            sumRight = (i == nums.length-1)? 0 : sumRight - nums[i+1];
        }
        return result;
    }

}
