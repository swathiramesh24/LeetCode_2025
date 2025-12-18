/*
You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
*/

//code
class Solution {
    public int climbStairs(int n) {
        int a = 1;
        int b = 2;

        if(n<=2)
        {
            return n;
        }

        for(int i=3;i<=n;i++)
        {
            int c = a+b;
            a=b;
            b=c;
        }
        return b;
    }
}
