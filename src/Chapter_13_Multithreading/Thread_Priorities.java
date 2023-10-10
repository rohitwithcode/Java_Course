package Chapter_13_Multithreading;

class Thread_Priority extends Thread{
    Thread_Priority(String name){
        super(name);
    }
    public void run(){
        int i=1;
        while (i<=300){
            System.out.println("Welcome "+this.getName());
            i++;
        }
    }
}


public class Thread_Priorities {
    public static void main(String[] args) {

        Thread_Priority thread_priority=new Thread_Priority("Coder1");
        Thread_Priority thread_priority1=new Thread_Priority("Rohit2");
        Thread_Priority thread_priority2=new Thread_Priority("Code3");
        Thread_Priority thread_priority3=new Thread_Priority("CodeWithRohit4");
        Thread_Priority thread_priority4=new Thread_Priority("CodeRohit VIP5");

        thread_priority4.setPriority(Thread.MAX_PRIORITY);
        thread_priority.setPriority(Thread.MIN_PRIORITY);
        thread_priority1.setPriority(Thread.MIN_PRIORITY);
        thread_priority2.setPriority(Thread.MIN_PRIORITY);
        thread_priority3.setPriority(Thread.MIN_PRIORITY);

        thread_priority.start();
        thread_priority1.start();
        thread_priority2.start();
        thread_priority3.start();
        thread_priority4.start();

    }
}
