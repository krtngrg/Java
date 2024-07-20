package dupli;

class Counter implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println("Count: "+i);
        }
    }

}
public class KirtanRunnable {
    public static void main(String[] args) {
        Counter count=new Counter();
        Thread thread1=new Thread(count);
        thread1.start();
    }
}
