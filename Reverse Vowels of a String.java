/*
Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once. 

Example 1:
Input: s = "IceCreAm"
Output: "AceCreIm"
Explanation:
The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".
*/

//code
class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int p1=0;
        int p2=arr.length-1;
        String vowels = "aeiouAEIOU";

        while(p1<p2)
        {
            if(vowels.indexOf(arr[p1])==-1)
            {
                p1++;
            }
            else if(vowels.indexOf(arr[p2])==-1)
            {
                p2--;
            }
            else
            {
                char temp = arr[p1];
                arr[p1]=arr[p2];
                arr[p2]=temp;
                p1++;
                p2--;
            }
        }
        return new String(arr);
    }
}
