class Lcm1
{
  static int lcm(int a, int b)
  {
    int larger = Math.max(a,b);
    
    int smaller = Math.min(a,b);
    
    for(int  i = larger;i <= a*b;i+=larger)
    {
      if(i % smaller == 0) return i;
    }
    return a * b;
  }
  public static void main(String[] args)
  {
    int a = 10 , b = 55;
    System.out.println(lcm(a,b));
  }
}