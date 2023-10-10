package Chapter_14_Errors_and_Exception_Handling;


import java.util.Scanner;

class  Radius_Exception extends Exception{
    public String toString(){
        return "Radius can't be negative";
    }
    public String getMessage(){
        return "Radius can't be negative";
    }
}
public class Throw_vs_Throws_Keyword {
    public static int divide(int x,int y) throws ArithmeticException{
        return x/y;
    }
    public static double Area(int radius) throws Radius_Exception{
        if (radius<0){
            throw new Radius_Exception();
        }
        double res=Math.PI*radius*radius;
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

//        System.out.println("Enter the value of a : ");
//        int a=scanner.nextInt();
//
//        System.out.println("Enter the value of b you want to divide with ");
//        int b=scanner.nextInt();
//
//        try {
//           int c= divide(a,b);
//            System.out.println(c);
//        }catch (Exception e){
//            System.out.println(e);
//            e.printStackTrace();
//        }
        System.out.println("Enter the radius of the circle : ");
        int radius=scanner.nextInt();
        try {
            double area=Area(radius);
            System.out.println(area);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
