import java.util.ArrayList;
class FibonacciSequence    // 0 1 1 2 3 5 8 13
{
  static int fibonacci(int pos)
  {
    if(pos == 0) return 0;
    if(pos == 1) return 1;
    
    return fibonacci(pos - 1) + fibonacci(pos - 2);
  }
  static ArrayList<Integer> fibonacciSequence(int pos)
  {
    ArrayList<Integer> fibList = new ArrayList<Integer>();
    for(int i = 0;i <= pos;i++)
    {
      if(pos == 0) {
        
        fibList.add(0);
        
        return fibList;
      }
      
      if(pos == 1) 
      { 
        fibList.add(0);
        fibList.add(1);
        
        return fibList;
      }
      
      fibList.add(fibonacci(i));
    }
    return fibList;
    
  }
  
  
  
  
  
  public static void main(String [] args)
  {
    //System.out.println("Fibonacci of 6 -->" + fibonacci(7));
    System.out.println(fibonacciSequence(1));
  }
  
}