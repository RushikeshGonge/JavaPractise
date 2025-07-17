interface Sample
{
    void meth1();
    void meth2();
}
interface childSample extends Sample
{
    void meth3();
    void meth4();
}
class MyClass implements childSample
{
    public void meth1()
    {
        System.out.println("Meth1");
    }
    public void meth2()
    {
        System.out.println("Meth2");
    }
    public void meth3()
    {
        System.out.println("Meth3");
    }
    public void meth4()
    {
        System.out.println("Meth4");
    }
}
public class inheritance_interface {
    public static void main(String[] args) {
        MyClass cls = new MyClass();
        cls.meth1();
        cls.meth2();
        cls.meth3();
        cls.meth4();
    }
}
