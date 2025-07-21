import java.util.ArrayList;
class UniquePrimeFactors
{
  static ArrayList<Integer> primeFactors(int num)
  {
    ArrayList<Integer> list = new ArrayList<Integer>();
    boolean flag = true;
    for(int i = 2;i <= num/2;i++)
    {
      
      if(num % i == 0)
      {
        flag = false;
        boolean isPrime = true;
        for(int j = 2;j <= i/2;j++)
        {
          if(i % j == 0) isPrime = false;
        }
        if(isPrime == true) list.add(i);
        
      }
    }
    if(flag == true) list.add(num);
    return list;
  }
  public static void main(String [] args)
  {
    ArrayList<Integer> newList = new ArrayList<Integer>();
    newList = primeFactors(100);
    System.out.println(newList);
  }
}