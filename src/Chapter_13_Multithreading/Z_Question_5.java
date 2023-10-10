package Chapter_13_Multithreading;

class Question_5 implements Runnable{

    @Override
    public void run() {
        int a=5;
    }
}

public class Z_Question_5 {
    public static void main(String[] args) {
        Question_5 question_5=new Question_5();

        System.out.println("The Reference of the question_5 is : "+Thread.currentThread());
    }
}
