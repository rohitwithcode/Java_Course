package Chapter_13_Multithreading;

class Coder extends Thread{

    public  void run(){
        int i=0;
        while (i<500){
            System.out.println("Coder is Running");
            System.out.println("We are enjoying the code");
            i++;
        }
    }
}class Programmer extends Thread{
    public void run(){
        int i=0;
        while (i<=500){
            System.out.println("Programmer is Running");
            System.out.println("We are Programmers");
            i++;
        }
    }
}

public class Multithreading_by_Thread_Class {
    public static void main(String[] args) {

        Coder coder=new Coder();
        Programmer programmer=new Programmer();

        coder.start();
        programmer.start();
    }
}
