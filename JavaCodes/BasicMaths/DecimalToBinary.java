import java.util.ArrayList;
import java.util.Collections;
class DecimalToBinary
{
  static ArrayList<String> decToBin(int num)
  {
    ArrayList<String> bin = new ArrayList<String>();
    while(num > 0)
    {
      bin.add(String.valueOf(num % 2));
      num = num / 2;
    }
    Collections.reverse(bin);
    return bin;
  }
  public static void main(String [] args)
  {
    System.out.println(decToBin(16));
  }
}