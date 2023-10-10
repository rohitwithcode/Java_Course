package Chapter_13_Multithreading;

class Question_2 extends Thread{
    public void run(){
        int i=1;
        while (i<=200){
            System.out.println("Good Morning");
            try {
                Thread.sleep(200);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        i++;
    }
}

class Question2 extends Thread{
    public void run() {
        int i = 1;
        while (i <= 200) {
            System.out.println("Good Evening");
            i++;
        }
    }
}

public class Z_Question_2 {
    public static void main(String[] args) {

        Question_2 question_2=new Question_2();
        Question2 question2=new Question2();

        question_2.start();
        question2.start();
    }
}
