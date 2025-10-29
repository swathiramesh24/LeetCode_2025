/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
Given a roman numeral, convert it to an integer.
Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3
*/

//solution
class Solution {
    public int romanToInt(String s) {
        int num=0;

        for(int i=0;i<s.length();i++)
        {
            int value=getValue(s.charAt(i));

            if(i+1<s.length() && value<getValue(s.charAt(i+1)))
            {
                num -= value;
            }
            else
            {
                num += value;
            }
        }
        return num;
    }

    private int getValue(char ch)
    {
        switch(ch)
        {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default: return 0;
        }
    }
}
