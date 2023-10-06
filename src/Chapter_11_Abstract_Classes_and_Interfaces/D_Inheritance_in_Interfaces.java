package Chapter_11_Abstract_Classes_and_Interfaces;

interface Parent{
    void method1();
    void method2();
}
interface Child extends Parent{
    void method3();
    void method4();
}
class Simple implements Parent,Child{

    @Override
    public void method1() {
        System.out.println("I am method 1");
    }

    @Override
    public void method2() {
        System.out.println("I am method 2");
    }

    @Override
    public void method3() {
        System.out.println("I am method 3");
    }

    @Override
    public void method4() {
        System.out.println("I am method 4");
    }
}
public class D_Inheritance_in_Interfaces {
    public static void main(String[] args) {

        Simple simple=new Simple();
        simple.method1();
        simple.method2();
        simple.method3();
        simple.method4();
    }
}
