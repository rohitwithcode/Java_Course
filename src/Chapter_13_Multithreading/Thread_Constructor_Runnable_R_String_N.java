package Chapter_13_Multithreading;

class T2 implements Runnable{

    @Override
    public void run() {
        int i=3;
        System.out.println("Hello");
    }
}
class Constructor_Take_Runnable_and_String extends Thread{
    public Constructor_Take_Runnable_and_String(Runnable r,String name){
        super(r,name);
    }

    @Override
    public void run() {
        System.out.println();
    }
}

public class Thread_Constructor_Runnable_R_String_N {
    public static void main(String[] args) {

        T2 t2=new T2();
        Constructor_Take_Runnable_and_String CtRaS=new Constructor_Take_Runnable_and_String(t2,"CodeWithRohit");
        CtRaS.start();

        System.out.println("The name of the Thread Constructor_Take_Runnable_and_String is : "+CtRaS.getName());
        System.out.println("The id of the Thread Constructor_Take_Runnable_and_String is : "+CtRaS.getId());

    }
}
