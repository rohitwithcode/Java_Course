package Chapter_13_Multithreading;

class Question_4 extends Thread{
    public void run(){
        int a=4;
        System.out.println("");
    }
}
class Question4 extends Thread{
    public void run(){
        int b=5;
    }
}

public class Z_Question_4 {
    public static void main(String[] args) {

        Question_4 question_4=new Question_4();
        Question4 question4=new Question4();
        System.out.println("\n The State of the Thread question_4 is : "+question_4.getState());
        System.out.println("\n The State of the Thread question4 is : "+question4.getState());

        question_4.start();
        question4.start();
        System.out.println("\n The State of the Thread question_4 is : "+question_4.getState());
        System.out.println("\n The State of the Thread question4 is : "+question4.getState());

    }
}
