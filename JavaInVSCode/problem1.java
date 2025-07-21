package calc;
class Calculator{
    public void calculate(int a, int b)
    {
        System.out.println("Your result is "+ a+b);
    }
}
class ScCalculator
{
    public void calculate(int a, int b)
    {
        System.out.println("Your result is " + Math.sin(a+b));
    }
}
class HybridCalculator
{
    public void calculate(int a, int b)
    {
        System.out.println("Your result is "+ a+b);
    }
    public void calculate1(int a, int b)
    {
        System.out.println("Your result is " + Math.sin(a+b));
    }
}
public class problem1 {
    protected int proint = 21;
    int defint = 23;
    public static void main(String[] args) {
        System.out.println("I am main method");
    }
    
}
