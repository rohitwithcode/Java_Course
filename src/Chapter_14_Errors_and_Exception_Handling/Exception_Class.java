package Chapter_14_Errors_and_Exception_Handling;

import java.util.Scanner;

class My_Exception extends Exception{
    public String toString(){
//        return super.toString() + "i am toString()";
        return "i am toString()";
    }
    public String getMessage(){
//        return super.getMessage() + "I am getMessage()";
        return  "I am getMessage()";
    }
}

public class Exception_Class {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter value of x : ");
        int x=scanner.nextInt();
        if (x<50){
            try {
                throw new My_Exception();
//                throw new ArithmeticException("Arithmetic Exception");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("Sure");
            }
            System.out.println("Ended");
        }
    }
}
