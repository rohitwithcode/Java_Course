package Chapter_12_Packages;

/* ***************** ACCESS MODIFIERS ******************

                     Class   Package   Subclass   World
       Public     :    Y        Y          Y         N
       Protected  :    Y        Y          N         N
       Default(No):    Y        Y          Y         Y
       Private    :    Y        N          N         N

 */

class C{
    public int a=4;
    protected int b=6;
    int c=5;
    private int d=9;

    public void A(){
        System.out.println("A : ");
    }
    public void B(){
        System.out.println("B : ");
    }
    public void C(){
        System.out.println("C : ");
    }
    public void D(){
        System.out.println("D : ");
    }

}

public class Access_Modifiers {
    public static void main(String[] args) {
        C c=new C();

//        c.A();
//        c.B();
//        c.C();
//        c.D();

        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.c);
//        System.out.println(c.d);  We don't use d in same package because the d is private has modifier



    }
}
