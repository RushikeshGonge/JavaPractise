import java.util.Scanner;
import java.util.ArrayList;
class PerfectNumber //perfect number is a number which is equal to the summation of its factors excluding itself ex 6 ---> 1 2 3 6 now 1+2+3 = 6 that is the number
{
  static boolean isPerfectNumber(int N)
  {
    int sum = 0;
    for(int i = 1;i <= N/2;i++)
    {
      if(N % i == 0) sum += i;
    }
    return sum == N;
  }
  static void printPerfectNumber()
  {
    ArrayList<Integer> perfectList = new ArrayList<Integer>();
    int i = 1;
    while(i <= 100)
    {
      if(isPerfectNumber(i)) perfectList.add(i);
      i++;
    }
    System.out.println("List of all perfect numbers upto 100 : ");
    System.out.println(perfectList);
  }
  public static void main(String [] args)
  {
    //int num;
    //Scanner sc = new Scanner(System.in);
    //System.out.println("Enter a number : ");
    //num = sc.nextInt();
    //System.out.println("Is perfect number ? --> " + isPerfectNumber(num));
    printPerfectNumber();
  }
  
}

// 6 , 28 , 496 are the only perfect numbers in 1 to 1000;