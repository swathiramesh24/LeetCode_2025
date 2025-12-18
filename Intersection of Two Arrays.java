/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
*/

//code
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();

        for(int i : nums1)
        {
            set.add(i);
        }

        Set<Integer> res =  new HashSet<>();

        for(int i : nums2)
        {
            if(set.contains(i))
            {
                res.add(i);
            }
        }

        int[] result = new int[res.size()];
        int i=0;
        for(int n:res)
        {
            result[i++]=n;
        }
        return result;
    }
}
