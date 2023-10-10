package Chapter_13_Multithreading;

class T extends Thread{
    public T(String name){
        super(name);
    }
    public  void run(){
        int i=1;
        System.out.println("Welcome");
//        while (i<=200){
//            System.out.println("I am Thread");
//            i++;
//        }
    }
}

public class Thread_Constructor_string_n {
    public static void main(String[] args) {
        T t=new T("Rohit");
        T t1=new T("Coder");
        t.start();
        t1.start();
        /* Thread getId() method*/
        System.out.println("The id of thread t is : "+t.getId());
        System.out.println("The name of thread t is : "+t.getName());

        // Thread getName() method
        System.out.println("The id of thread t1 is : "+t1.getId());
        System.out.println("The name of thread t1 is : "+t1.getName());

    }
}
