package Chapter_7_Methods_and_Recursion;

public class Method_Basic {
    //      int function(int x,int y){
    static  int function(int x,int y){
        if (x>y){
            return x+y;
        }
        else {
            return x*y;
        }
    }
    public static void main(String[] args) {

        int a=function(4,5);
        System.out.println(a);
//        Method invoke using object
//        Methods_Basic mb=new Methods_Basic();
//        int a=mb.function(5,6);
//        System.out.println(a);

    }
}
