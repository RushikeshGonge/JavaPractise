class Base2
{
    int a;
//    Base2()
//    {
//        System.out.println("This is base class constructor");
//    }
    Base2(int a)
    {
        this.a = a;
    }
    int geta()
    {
        return a;
    }
}
class Derived2 extends Base2{
    Derived2()
    {
        super(12);
        System.out.println("This is derived class constructor");
    }
}
public class this_super_keyword {
    public static void main(String[] args) {
        Derived2 d = new Derived2();
        System.out.println(d.geta());;

    }
}
