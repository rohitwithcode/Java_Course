package Chapter_10_Inheritence;

class This_Super{
    int a;

    public int getA() {
        return a;
    }

    This_Super(int a){
        this.a=a;
        System.out.println("I am a constructor of Base with value of "+this.a);
    }
    public int One(){
        return 1;
    }
}
class Two extends This_Super{
    Two(int c){
        super(c);
        System.out.println("I am a constructor of derived class with value of "+c);
    }
}
public class D_This_and_Super_Keyword {
    public static void main(String[] args) {
       // This_Super this_super=new This_Super(5);
//        System.out.println("The value of x is : "+this_super.getA());

        Two two=new Two(4);
    }
}
