/*
Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

Example 1:
Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
*/

//code
class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;

        do
        {
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));
        }while(slow!=fast);
         return slow==1;
    }

    private int sumOfSquares(int n)
    {
        int sum = 0;
        while(n>0)
        {
            int l = n%10;
            sum += l*l;
            n=n/10;
        }
        return sum;
    }
}
