class MyThread4 extends Thread
{
    public MyThread4(String name)
    {
        super(name);
    }
    @Override
    public void run()
    {

            System.out.println("Thread name :" + this.getName() );

    }
}
public class ThreadPriority {
    public static void main(String[] args) {
            MyThread4 t1 = new MyThread4("Rushi1");
        MyThread4 t2 = new MyThread4("Rushi2");
        MyThread4 t3 = new MyThread4("Rushi3");
        MyThread4 t4 = new MyThread4("Rushi4");
        MyThread4 t5 = new MyThread4("Rushi5");

        t3.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
//        t1.setPriority(Thread.MIN_PRIORITY);
//        t4.setPriority(Thread.MIN_PRIORITY);
//        t5.setPriority(Thread.MIN_PRIORITY);


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
