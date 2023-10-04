package Chapter_8_OOPs;

import java.util.Scanner;

class Square{
    int side;

    public void setSide(int side) {
        this.side = side;
    }
    public int getArea(){
        return side*side;
    }
    public int getPerimeter(){
        return 4*side;
    }
}

public class Z_Question_3 {
    public static void main(String[] args) {

        Square s=new Square();

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the side of the square : ");
        int side=scanner.nextByte();

        s.setSide(side);

       int area= s.getArea();
        System.out.println("The Area of the square is : "+area);

        int perimeter=s.getPerimeter();
        System.out.println("The Perimeter of the square is : "+perimeter);
    }
}
