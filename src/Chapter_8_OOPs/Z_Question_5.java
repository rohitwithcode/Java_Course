package Chapter_8_OOPs;

import java.util.Scanner;

class Circle{
    int radius;

    public void setRadius(int r){
        radius=r;
    }
    public float getArea(){
        return 3.14f*radius*radius;
    }
    public float getPerimeter(){
        return 2*3.14f*radius;
    }
}

public class Z_Question_5 {
    public static void main(String[] args) {

    Circle c=new Circle();

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the radius of the circle : ");
        int radius=scanner.nextByte();

    c.setRadius(radius);

    float area=c.getArea();
        System.out.println("The area of the square is : "+area);

        float Perimeter=c.getPerimeter();
        System.out.println("The perimeter of the cirlce is : "+Perimeter);
    }
}
