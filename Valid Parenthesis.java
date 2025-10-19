/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:
Input: s = "()"
Output: true
*/

//code
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();

        for(char i:arr)
        {
            if(i=='('||i=='{'||i=='[')
            {
                stack.push(i);
            }

            else
            {
                if(stack.isEmpty() || ((i==')' && stack.pop()!='(')||
                                        (i==']' && stack.pop()!='[')||
                                        (i=='}' && stack.pop()!='{')))
                {
                    return false;
                }
            }
        }
        return stack.isEmpty(); 
    }
}
