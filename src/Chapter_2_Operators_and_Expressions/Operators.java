package Chapter_2_Operators_and_Expressions;

public class Operators {
    public static void main(String[] args) {
        int a=4;
        int b=4+a;
        int b1=8-a;

        System.out.println("Arithmetic Operators --------");
        System.out.println("4+a="+b);
        System.out.println("8-a="+b1);

        b +=12;
        System.out.println("b="+b);

        int b2=b1%3;
        System.out.println("b1%3="+b2);

//        Comparison Operator
        System.out.println("Comparison Operators ---------");
        System.out.println(34<b);
        System.out.println(56>a);
        System.out.println(a<=23);

//        Logical Operator
        System.out.println("Comparison Operators --------");
        System.out.println(23>5 && 23>6);
        System.out.println(45>34 || 45<23);

        System.out.println("Bitwise Operators --------");
        System.out.println(3 & 2);
        System.out.println(302 & 20);
    }
}
