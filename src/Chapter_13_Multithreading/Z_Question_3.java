package Chapter_13_Multithreading;

class Question3 extends Thread{
    public void run(){
        int i=3;
        System.out.println("Priority is Below.....");
    }
}
public class Z_Question_3 {
    public static void main(String[] args) {
        Question3 question3=new Question3();

        question3.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Priority of question3 is : "+question3.getPriority());
    }
}
