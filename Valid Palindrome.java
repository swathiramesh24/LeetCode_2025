/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
*/

//code
class Solution {
    public boolean isPalindrome(String s) {
        int p1=0;
        int p2=s.length()-1;

        while(p1<p2)
        {
            char left = s.charAt(p1);
            char right = s.charAt(p2);

            if(!Character.isLetterOrDigit(left))
            {
                p1++;
            }
            else if(!Character.isLetterOrDigit(right))
            {
                p2--;
            }
            else
            {
                if(Character.toLowerCase(left)!=Character.toLowerCase(right))
                {
                    return false;
                }
                p1++;
                p2--;
            }
        }
        return true;
    }
}
