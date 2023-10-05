package Chapter_9_Access_Modifiers_and_Constructor;

import java.util.Scanner;

class Cylinder1{
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
    float sa;
    float v;
    public void surfaceArea(){
        float v = 3.14f * getRadius() * getHeight();
        float v1=2*v;
        float x=3.14f*getRadius()*getRadius();
        float x1=2*x;
        sa=v1+x1;
    }
    public void Volume(){
        v=3.14f*getRadius()*getRadius()*getHeight();
    }
    public void display_Surface_Area(){
        System.out.println("The Surface Area of the Cylinder is : "+sa);
    }
    public void display_Volume(){
        System.out.println("The Volume of the Cylinder is : "+v);
    }
}
public class Z_Question_2 {
    public static void main(String[] args) {

        Cylinder1 cylinder1=new Cylinder1();

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the Radius of the Cylinder : ");
        int radius=scanner.nextInt();

        System.out.println("Enter the Height of the Cylinder : ");
        int height=scanner.nextInt();

        cylinder1.setRadius(radius);
        int r=cylinder1.getRadius();
        System.out.println("The Radius of the Cylinder1 is : "+r);

        cylinder1.setHeight(height);
        int h=cylinder1.getHeight();
        System.out.println("The Height of the Cylinder is : "+h);

        cylinder1.surfaceArea();;
        cylinder1.display_Surface_Area();

        cylinder1.Volume();
        cylinder1.display_Volume();

    }
}
