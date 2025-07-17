class MyThread3 extends Thread
{
   public MyThread3(String name)
   {
       super(name);

   }
}
public class threadConstructors {
    public static void main(String[] args) {
        MyThread3 t1 = new MyThread3("Rushi");
        t1.start();
        System.out.println("Thread t1 id is :"+t1.getId());
        System.out.println("Thread t1 name is :"+t1.getName());

    }
}
