import java.util.Scanner;

class  Built_in_Class{
    public void display(int a){
        System.out.println("Hello\n\tHow are you\n\t\t\tI am here : "+a);
    }
}

public class Z_Question_2 {
    protected int x=4;
        int y=5;
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the input to display the message : ");
        int a=sc.nextInt();

        Built_in_Class btc=new Built_in_Class();
        btc.display(a);;
    }
}
