package caculator;

class Calculator{
    public void calcualte(int a,int b){
        System.out.println("Your result is : "+(a+b));
    }
}

class ScientificCalculator{
    public void calcualte(int a,int b){
        System.out.println("Your Result is :"+ Math.sin(a+b));
    }
}

class HybridCalculator{
    public void calcualte(int a,int b){
        System.out.println("Your Result is :"+ Math.sin(a+b));
        System.out.println("Your result is : "+(a+b));
    }
}
public class Z_Question_1{
    public static void main(String args []){

        System.out.println("Main method ...");
    }
}