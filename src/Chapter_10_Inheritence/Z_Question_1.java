package Chapter_10_Inheritence;

class Circle{

    int r;

    public float Area(){
        float a= 3.14f*r*r;
        return a;
    }
}

class Cylinder extends Circle{
    int r1,h;

    public float cylinderArea(){
        float a1=3.14f*r*r*h;
        return a1;
    }
}
public class Z_Question_1 {
    public static void main(String[] args) {

        Cylinder cylinder=new Cylinder();
        cylinder.h=45;
        cylinder.r1=6;
        cylinder.r=3;

        float area=cylinder.Area();
        System.out.println("Area of circle is :"+area);

        float areaCylinder=cylinder.cylinderArea();
        System.out.println("Area of cylinder is :"+areaCylinder);
    }
}
