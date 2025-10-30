/*
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
Notice that you may not slant the container.

Example 1:
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
*/

//solution
class Solution {
    public int maxArea(int[] height) {
        int p1=0;
        int p2=height.length -1;
        int area = Integer.MIN_VALUE;
        while(p1<p2)
        {
            int currArea;
            if(height[p1]<height[p2])
            {
                currArea= height[p1]*(p2-p1);
                p1++;
            }
            else
            {
                currArea= height[p2]*(p2-p1);
                p2--;
            }
            if(area<currArea)
            {
                area=currArea;
            }
        }
        return area;
    }
}
