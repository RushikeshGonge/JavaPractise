interface Bicycle
{
    int a = 12;
    void applyBrakes();
    void speedUp();
}
interface Tricycle
{
    void tyres();
}
class HeroCycle implements Bicycle , Tricycle
{
    public void applyBrakes()
    {
        System.out.println("Applying brakes...");
    }
    public void speedUp()
    {
        System.out.println("Speeding Up...");
    }
    public void tyres()
    {
        System.out.println("I am tricycle I have three tyres...");
    }
}
public class interfaces {
    public static void main(String[] args) {
        HeroCycle obj = new HeroCycle();
       // Bicycle obj1 = new Bicycle(); can not create object of interface
        obj.applyBrakes(); // interface methods can only be accessed through the class which implements it
        obj.speedUp();
        obj.tyres();
        //obj.a = 13; not allowed because variables in interfaces are by default final
        System.out.println(obj.a);
    }
}
