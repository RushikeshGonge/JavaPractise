class BinaryToDecimal
{
  static int binToDec(String str)
  {
    int len = str.length();
    int power = 0;
    int dec = 0;
    
    for(int i = len - 1;i >= 0;i--)
    {
      char bit = str.charAt(i);
      if(bit == '1') dec += Math.pow(2,power);
      power++;
    }
    return dec;
  }
  public static void main(String [] args)
  {
    System.out.println(binToDec("1110"));
  }
}