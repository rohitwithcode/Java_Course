package Chapter_9_Access_Modifiers_and_Constructor;

import java.util.Scanner;

class Cylinder{
    private int radius;
    private int height;

    public void setRadius(int r){
        radius=r;
    }
    public void setHeight(int h){
        height=h;
    }
    public int getRadius(){
        return radius;
    }
    public  int getHeight() {
        return height;
    }
}

public class Z_Question_1 {
    public static void main(String[] args) {

        Cylinder cylinder=new Cylinder();

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the Radius of the Cylinder : ");
        int radius=scanner.nextInt();

        System.out.println("Enter the Height of the Cylinder : ");
        int height=scanner.nextInt();

        cylinder.setRadius(radius);
        int r=cylinder.getRadius();
        System.out.println("The Radius of the Cylinder is : "+r);

        cylinder.setHeight(height);
        int h=cylinder.getHeight();
        System.out.println("The Height of the Cylinder is : "+h);
    }
}
