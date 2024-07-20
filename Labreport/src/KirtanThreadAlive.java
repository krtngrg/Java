package dupli;

public class KirtanThreadAlive extends Thread
{
    public void run()
    {
        try
        {
            System.out.println("is run() method isAlive "+Thread.currentThread().isAlive());
            Thread.sleep(300);
        }
        catch (InterruptedException ie) {
        }
    }
    public static void main(String[] args)
    {
        KirtanThreadAlive t1 = new KirtanThreadAlive();
        System.out.println("before starting thread isAlive: "+t1.isAlive());
        t1.start();
        System.out.println("after starting thread isAlive: "+t1.isAlive());

        String str=String.join("","Happy","birthday");
        System.out.println(str);
    }
}