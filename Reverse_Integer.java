/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
  
Example 1:
Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
*/

//solution
class Solution {
    public int reverse(int x) {
        long reverse = 0;
        while (x != 0) {
            int l = x % 10;
            reverse = reverse * 10 + l;
            x = x / 10;
        }

        return (reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE) ? 0 : (int) reverse;
    }
}
