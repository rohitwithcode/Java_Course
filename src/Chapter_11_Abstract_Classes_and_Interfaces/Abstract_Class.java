package Chapter_11_Abstract_Classes_and_Interfaces;

abstract class Base{

    public Base(){
        System.out.println("I am the Base Constructor");
    }
    public void Hello(){
        System.out.println("Hello");
    }
    abstract public void Greet();
    abstract public void sum();
}
class Derived extends Base{
    public void Greet(){
        System.out.println("Good Morning Bro by Derived");
    }
    public void sum(){
        System.out.println("Sum = "+(4+3));
    }
}
abstract class Derived2 extends Base{
    public void Some(){
        System.out.println("I am Some");
    }
}
public class Abstract_Class {
    public static void main(String[] args) {

//        Base base=new Base();  It will throw error

        Derived derived=new Derived();
        derived.Greet();
//        Derived2 derived2=new Derived2(); It will also throw error
    }
}
