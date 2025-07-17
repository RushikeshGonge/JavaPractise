import java.util.Scanner;
public class hello{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 100;
        int num2;
        System.out.println("Enter the number :");
        num2 = sc.nextInt();
        if(num2>num1)
        System.out.println("Entered number is greater");
        else if(num2<num1)
        System.out.println("Entered number is smaller");
        else
        {
            System.out.println("Numbers are equal");
        }
    }
}