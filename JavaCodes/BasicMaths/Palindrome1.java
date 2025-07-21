class Solution
{
  int num = 0;
  Solution(int num){
  this.num = num;
  }
  public boolean isPalindrome()
  {
    String str1 = String.valueOf(num);
    int length = str1.length();
    for(int i = 0; i < length/2; i++)
    {
      if(str1.charAt(i) != str1.charAt(length - 1 - i)) return false;
    }
    return true;
  }
}


class Palindrome1{
   public static void main(String [] args)
   {
     Solution s1 = new Solution(123);
     System.out.println("Is number palindrome? -->" + s1.isPalindrome());
   
   }
}