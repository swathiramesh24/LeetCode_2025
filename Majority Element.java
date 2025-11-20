/*
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3
*/

//code
class Solution {
    public int majorityElement(int[] nums) {
        int c=0, num=0;

        for(int i:nums)
        {
            if(c==0)
            {
                num=i;
            }
            c += (num==i)? 1 : -1;
        }
        return num;
    }
}
