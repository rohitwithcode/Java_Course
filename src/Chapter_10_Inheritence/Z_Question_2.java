package Chapter_10_Inheritence;

class  Rectangle{
    int l,b;
    Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    public float areaRectangle(){
        return l*b;
    }
}
class Cuboid extends Rectangle{
    int h;
    Cuboid(int l,int b,int h){
        super(l,b);
        this.h=h;
    }
    public float areaCuboid(){
         float d= (l*b)+(b*h)+(l*h);
        return 2*d;
    }
}

public class Z_Question_2 {
    public static void main(String[] args) {

        Cuboid cuboid=new Cuboid(3,4,5);
        float areaRectangle=cuboid.areaRectangle();
        System.out.println("Area of the Rectangle : "+areaRectangle);

        float a=cuboid.areaCuboid();
        System.out.println("The area of the Cuboid is : "+a);


    }
}
