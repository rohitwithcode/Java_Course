package Chapter_13_Multithreading;

class Thread_Method extends Thread{
    public void run(){
        int i=0;
        while (true){
            System.out.println("Hello");
            i++;
            try {
                Thread.sleep(455);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Thread_Method1 extends Thread {
    public void run() {
        int i = 0;
        while (true) {
            System.out.println("Bolo");
            i++;
        }
    }
}
public class Thread_Methods {
    public static void main(String[] args) {

        Thread_Method thread_method=new Thread_Method();
        Thread_Method1 thread_method1=new Thread_Method1();

        thread_method.start();
//        try {
//            thread_method.join();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }

        thread_method1.start();
    }
}
