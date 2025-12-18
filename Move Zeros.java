/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
*/

//code
class Solution {
    public void moveZeroes(int[] nums) {
        int p1=0;
        for(int p2=0;p2<nums.length;p2++)
        {
            if(nums[p2]!=0)
            {
                int temp = nums[p1];
                nums[p1]= nums[p2];
                nums[p2]=temp;
                p1++;
            }
        }
    }
}
