package Chapter_10_Inheritence;

import java.util.Scanner;

class Base{

   private int x;

    public int getX() {
        return x;
    }

    public void setX(int a) {
        x = a;
    }
}
class Derived extends Base{
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int b) {
        y = b;
    }
    public void Print(){
        System.out.println("The value of the x is : "+getX());
        System.out.println("The Value of the y is : "+getY());
    }
}
public class A_Inheritence_Basic {
    public static void main(String[] args) {

        Derived derived=new Derived();

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of the x :");
        int x=scanner.nextInt();
        derived.setX(x);

        System.out.println("Enter the value of the y : ");
        int y=scanner.nextInt();
        derived.setY(y);

        derived.Print();
    }
}
