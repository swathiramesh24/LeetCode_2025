/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"
*/

//solution
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        for(int i=0;i<first.length();i++)
        {
            if(first.charAt(i)!=last.charAt(i))
            {
                return res.toString();
            }
            res.append(first.charAt(i));
        }
        return res.toString();
    }
}
