//method 1
/*class GCD
{
  static int gcd(int num1, int num2)
  {
    int result = Math.min(num1,num2);
    while(result > 0)
    {
      if(num1 % result == 0 && num2 % result == 0) break;
      result--;
    }
    return result;
  }
  public static void main(String[] args)
  {
    System.out.println("GCD = " + gcd(101,101)); 
  }
}*/

//method 2
class GCD
{
  static int gcd(int num1,int num2)
  {
    if(num1 == 0) return num2;
    if(num2 == 0) return num1;
    if(num1 == num2) return num1;
    
    if(num1 > num2)
    {
      if(num1 % num2 == 0) return num2;
      return gcd(num1 - num2,num2);
    }
    
    if(num2 % num1 == 0) return num1;
    return gcd(num1,num2 - num1);
  }
  public static void main(String [] args)
  {
    System.out.println("GCD = " + gcd(3,7));
  }
}