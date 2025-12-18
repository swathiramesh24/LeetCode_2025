/*
Given two binary strings a and b, return their sum as a binary string.

Example 1:
Input: a = "11", b = "1"
Output: "100"

Example 2:
Input: a = "1010", b = "1011"
Output: "10101"
*/

//code
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();

        int p1 = a.length()-1;
        int p2 = b.length()-1;
        int c = 0;

        while(p1>=0 || p2>=0 || c>0)
        {
            int sum = c;
            
            if(p1>=0)
            {
                sum += a.charAt(p1--)-'0';
            }
            if(p2>=0)
            {
                sum += b.charAt(p2--)-'0';
            }

            sb.append(sum%2);
            c = sum/2;
        }
        return sb.reverse().toString();
    }
}
