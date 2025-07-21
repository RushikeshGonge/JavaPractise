class LargestAndSmallest1  //Time complexity --> O(logn)
{
  static void Digits(int N)
  {
    int largest = 0;
    int smallest = 9;
    if(N < 0) N = N * -1;
    if(N >= 0 && N < 10)
    {
      System.out.println("Largest : " + N + "   Smallest : " + N);
      return;
      
    }
    while(N != 0)
    {
      int remainder = N % 10;
      
      largest = Math.max(remainder,largest);
      smallest = Math.min(remainder,smallest);
      
      N = N / 10;
    }
    System.out.println("Largest : " + largest + "   Smallest : " + smallest);
  }
  public static void main(String[] args)
  {
    Digits(-12);
  }
}