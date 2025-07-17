import java.util.Scanner;
class IsLeap{
  static boolean isLeap(int year)
  {
    if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) return true;
    return false;
  }
  public static void main(String [] args)
  {
    int year = 0;
    Scanner sc = new Scanner(System.in);
    
    while(year != -1){
    System.out.println("To exit the program enter -1.");
    System.out.println("Enter year : ");
    year = sc.nextInt();
    System.out.println("Is "+ year +" leap year ? -->" + isLeap(year));
    }
  }
}