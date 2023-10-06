package Chapter_10_Inheritence;

class Circle{
    int r;
    Circle(int r){
        this.r=r;
    }
    public double Area(){
//        float a= 3.14f*r*r;
//        return a;
        return Math.PI*this.r*this.r;
    }
}
class Cylinder extends Circle{
    int h;
    Cylinder(int r,int h){
        super(r);
        this.h=h;
    }
    public float cylinderArea(){
        float a1=3.14f*r*r*h;
        return a1;
//        return Math.PI*this.r*this.r*this.h;
    }
}
public class Z_Question_1 {
    public static void main(String[] args) {

        Cylinder cylinder=new Cylinder(5,6);

        double area=cylinder.Area();
        System.out.println("Area of circle is :"+area);

        float areaCylinder=cylinder.cylinderArea();
        System.out.println("Area of cylinder is :"+areaCylinder);
    }
}
