class Solution
{
  String str;
  Solution(String str)
  {
    this.str = str;
  }
  public boolean isPalindrome()
  {
    int strSize = str.length();
    for(int i = 0;i < strSize/2;i++)
    {
      if(str.charAt(i) != str.charAt(strSize - 1 - i)) return false;
    }
    return true;
  }
}


class Palindrome2
{
  public static void main(String[] args)
  {
    Solution s1 = new Solution("rushi");
    System.out.println("Is string palindrome? --> " + s1.isPalindrome());
  }
}