class Solution {
public:
    bool isPalindrome(int num) {
        if (num < 0) 
          return false; 

        int original = num;
        int reversed = 0;

        while (num != 0)
        {
            int s = num % 10;
            reversed = reversed * 10 + s;
            num = num / 10;
        }

        return original == reversed;
    }
};
