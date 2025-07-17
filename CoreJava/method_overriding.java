// Method overriding
class A
{
    public void meth()
    {
        System.out.println("I am first method");
    }
}
class B extends A
{
    @Override
    public void meth()
    {
        System.out.println("I am overridden method");
    }
    public void meth2()
    {
        System.out.println("I am second method");
    }
}
public class method_overriding {
    public static void main(String[] args) {
        B b = new B();
        b.meth();
        b.meth2();
        A a = new A();
        a.meth();

    }
}
