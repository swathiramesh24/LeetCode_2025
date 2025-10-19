/*
Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.

Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
*/

//code
class Solution {
    public void reverseString(char[] s) {
        int p1=0;
        int p2=s.length-1;

        while(p1<p2)
        {
            char temp = s[p1];
            s[p1]=s[p2];
            s[p2]=temp;
            p1++;
            p2--;
        }
    }
}
