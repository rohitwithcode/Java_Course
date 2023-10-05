package Chapter_9_Access_Modifiers_and_Constructor;

import java.util.Scanner;

class Rectangle{

    private int length;
    private int breadth;
    Rectangle(){
        length=4;
        breadth=5;
    }
    public void defaultDisplay(){
        System.out.println("The Length of the Rectangle is : "+length);
        System.out.println("The Breadth of the Rectangle is : "+breadth);
    }
    Rectangle(int l,int b){
        length=l;
        breadth=b;
    }
    public void overloadDisplay(){
        System.out.println("The Length of the Overloaded Rectangle Constructor is : "+length);
        System.out.println("The Breadth of the Overloaded Rectangle Constructor is : "+breadth);
    }
}

public class Z_Question_3 {
    public static void main(String[] args) {

        Rectangle rectangle=new Rectangle();
        rectangle.defaultDisplay();

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the Length of the Rectangle : ");
        int length=scanner.nextInt();

        System.out.println("Enter the Breadth of the Rectangle : ");
        int breadth=scanner.nextInt();

        Rectangle rectangle1=new Rectangle(length,breadth);
        rectangle1.overloadDisplay();;
    }
}
