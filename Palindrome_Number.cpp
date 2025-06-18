/*
Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 
Constraints:
-2^31 <= x <= 2^31 - 1
  */

//answer
class Solution {
 public:
  bool isPalindrome(int x) {
    if (x < 0)
      return false;

    long reversed = 0;
    int y = x;

    while (y > 0) {
      reversed = reversed * 10 + y % 10;
      y /= 10;
    }

    return reversed == x;
  }
};


/*
Explanation
A function called is palindrome is implemented. if the given input is less than 0, it cannot be a palindrome so we return false. 
then we assume x to a variable y so that we dont lose the original value. long is used for reverse beacuse doing multiplication and addition can cause overflow.
while y is not negative example as 121
0*10 + 1 = 1
1*10 + 2 = 12
12*10 + 1 = 121
return reversed == x will give true or false
*/
