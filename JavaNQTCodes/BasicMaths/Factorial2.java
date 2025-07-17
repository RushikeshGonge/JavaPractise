class Factorial2
{
  static int factorial(int num)
  {
    int fact = 1;
    while(num > 0)
    {
      fact = fact * (num--);
   
    }
    return fact;
  }
  public static void main(String[] args)
  {
    System.out.println("Factorial : " + factorial(5));
  }
}