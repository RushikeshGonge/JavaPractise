class Solution
{
    int n = 0;
    Solution(int num)
    {
        n = num;
    }
    public boolean isPalindrome()
    {
       // String number = String.valueOf(n);
        String num1 = Integer.toString(n);
        int size = num1.length();
        for(int i = 0; i < size/2; i++)
        {
            if(num1.charAt(i) != num1.charAt(size - 1 - i)) return false;
            
        }
        return true;
    }
}
public class Palindrome {
    public static void main(String[] args) {
        Solution s1 = new Solution(123321);
        System.out.println("Is palindrome: " + s1.isPalindrome());
    }
    
}
