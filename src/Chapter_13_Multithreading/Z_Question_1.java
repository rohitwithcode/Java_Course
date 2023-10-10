package Chapter_13_Multithreading;

class Question_1 extends  Thread{
    public void run(){
        int i=1;
        while (i<=200){
            System.out.println("Good Morning");
            i++;
        }
    }
}
class Question1 extends Thread{
    public void run(){
        int i=1;
        while (i<=200){
            System.out.println("Good Evening");
            i++;
        }
    }
}

public class Z_Question_1 {
    public static void main(String[] args) {

        Question_1 question_1=new Question_1();
        Question1 question1=new Question1();

        question_1.start();
        question1.start();

    }
}
