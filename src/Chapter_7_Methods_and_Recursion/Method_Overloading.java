package Chapter_7_Methods_and_Recursion;

public class Method_Overloading {
    static  void Change(int x){
         x=450;
    }
    static  void Change(int [] arr){
        arr[0]=67;
    }
    public static void main(String[] args) {

//        Changing the value of X is or not :
        int x=45;
        Change(x);
        System.out.println("The value of the X is : "+x);

//        Changing the value of the Array:
        int [] arr={3,4,54,3,4,5,6};
        Change(arr);
        System.out.println("The value of the arr[0] is : "+arr[0]);

    }
}
