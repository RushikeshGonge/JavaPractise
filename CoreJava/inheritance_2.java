class Base1
{
    Base1()
    {
        System.out.println("This is base class constructor");
    }
    Base1(int x)
    {
        System.out.println("This is base class constructor with x : " + x);
    }

}
class Derived1 extends Base1{
    Derived1()
    {
        System.out.println("This is derived class constructor");
    }
    Derived1(int x,int y)
    {
        super(x);
        System.out.println("This is derived class constructor with value of y : " + y);
    }
}
class grandchild extends Derived1
{
    grandchild()
    {
        System.out.println("This is grandchild class constructor");
    }
    grandchild(int x , int y, int z)
    {
        super(x, y);
        System.out.println("This is grandchild class constructor with value of z :"+ z);
    }
}
public class inheritance_2 {
    public static void main(String[] args) {
        //Base1 b = new Base1();
        //Derived1 d = new Derived1(12,23);
        grandchild gc = new grandchild(1,2,3);
    }
}
