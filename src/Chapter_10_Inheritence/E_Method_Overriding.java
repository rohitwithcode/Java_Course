package Chapter_10_Inheritence;

class Overriding{
    public int a;
    public void Coder1(){
        System.out.println("Coder 1");
    }
}

class OverRide extends Overriding{
    public void Coder2(){
        System.out.println("Coder 2");
    }
    public void Coder1(){
        System.out.println("I am Coder 1 of Override");
    }
}
public class E_Method_Overriding {
    public static void main(String[] args) {

        Overriding overriding=new Overriding();
        overriding.Coder1();

        OverRide overRide=new OverRide();
        overRide.Coder1();

    }
}
