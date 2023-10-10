package Chapter_13_Multithreading;

class  ThreadRunnable1 implements Runnable{

    @Override
    public void run() {
        int i=1;
        while (i<=100){
            System.out.println("I am Runnable interface 1");
            i++;
        }

    }
}
class  ThreadRunnable2 implements Runnable{

    @Override
    public void run() {
        int i=1;
        while (i<=100){
            System.out.println("I am Runnable interface 2");
            i++;
        }

    }
}

public class MultiThreading_by_implementing_Runnable_interface {
    public static void main(String[] args) {

        ThreadRunnable1 bullet1=new ThreadRunnable1();
        ThreadRunnable2 bullet2=new ThreadRunnable2();

        Thread gun1=new Thread(bullet1);
        Thread gun2=new Thread(bullet2);

        gun1.start();
        gun2.start();;

    }
}
