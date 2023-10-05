package Chapter_10_Inheritence;

class B{
    private int a;

    B(){
        System.out.println("Constructor of  B");
    }
    B(int x){
        a=x;
        System.out.println("I am a overloaded constructor with Value of a : "+a);
    }
}
class D extends B{
    private int b;
    D(){
//        super(3);
        System.out.println("Constructor of D");
    }
    D(int x,int y){
        super(x);
        System.out.println("I am a overloaded constructor with Value of x,y: "+x+","+y);
    }
}
class CD extends D{
    CD(){
        System.out.println("I am a CD Constructor....");
    }
    CD(int x,int y,int z){
        super(x,y);
        System.out.println("I am a overloaded costructor with value of x,y and z : "+x+","+y+" and "+z);
    }
}
public class Constructor_in_Inheritence {
    public static void main(String[] args) {

//        B b=new B();
//        D d=new D();
//        D d1=new D(4,5);
//        CD cd=new CD();
        CD cd1=new CD(5,676,8);
    }
}
