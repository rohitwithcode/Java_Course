package Chapter_10_Inheritence;

class Dynamic{

    public void Welcome(){
        System.out.println("Welcome");
    }
    public void name(){
        System.out.println("Hi Coder Dynamic");
    }
}

class Dynamic_Dispatch extends Dynamic{

    public void Most_Welcome(){
        System.out.println("Most Welcome");
    }
    public void name(){
        System.out.println("Hi Coder Dynamic Dispatch");
    }
}
public class F_Dynamic_Method_Dispatch {
    public static void main(String[] args) {

//        Dynamic dynamic=new Dynamic();
//        dynamic.name();
//       Dynamic_Dispatch dynamic_dispatch=new Dynamic_Dispatch();
//

//        Dynamic_Dispatch dynamic_dispatch1=new Dynamic();  Not Allowed

        Dynamic dynamic1=new Dynamic_Dispatch(); // it is allowed

        dynamic1.Welcome();;
        dynamic1.name();
//        dynamic1.Most_Welcome(); Not Allowed


    }
}
