class ArmstrongNumber
{
  static boolean isArmstrongNumber(int num)
  {
    String number = Integer.toString(num);
    int length = number.length();
    int output = 0;
    
    for(char c : number.toCharArray())
    {
      output += Math.pow(c - '0',length);
    }
    
    if(output == Integer.parseInt(number)) return true;
    return false;
  }
  public static void main(String [] args)
  {
    System.out.println("Is Armstrong ? -->" + isArmstrongNumber(371));
  }
}