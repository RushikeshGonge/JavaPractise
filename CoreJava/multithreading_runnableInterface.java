class MyThreadRunnable1 implements Runnable
{
    public void run()
    {
       while(true)
       {
           System.out.println("This is thread 1 running...");
       }


    }

}
class MyThreadRunnable2 implements Runnable
{
    public void run()
    {
        while(true)
        {
            System.out.println("This is thread 2 running...");
        }


    }

}
public class multithreading_runnableInterface {
    public static void main(String[] args) {
        MyThreadRunnable1 r1 = new MyThreadRunnable1();
        Thread t1 = new Thread(r1);

        MyThreadRunnable2 r2 = new MyThreadRunnable2();
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

    }
}
