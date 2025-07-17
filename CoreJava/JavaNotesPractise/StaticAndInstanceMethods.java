package JavaNotesPractise;

public class StaticAndInstanceMethods {
    void meth1()
    {
        meth2();
        System.out.println("I am instance of meth1");
    }

    void meth2()
    {

        System.out.println("I am instance of meth2 method");
    }

    static void meth3()
    {
//        StaticAndInstanceMethods obj1 = new StaticAndInstanceMethods();
//        obj1.meth2();

        System.out.println("I am instance of static meth3 method");
    }
    static void meth4()
    {
        meth3();
        System.out.println("I am instance of static meth4 method");
    }

    public static void main(String[] args) {
        //StaticAndInstanceMethods obj = new StaticAndInstanceMethods();
       // obj.meth1();
       // obj.meth2();
       // StaticAndInstanceMethods.meth2(); instance method cannot be called from class name
//        StaticAndInstanceMethods.meth3(); // static method can be called by class name
//        meth3(); // static method can be called directly
       // StaticAndInstanceMethods.meth3();
        meth4();

    }
}
