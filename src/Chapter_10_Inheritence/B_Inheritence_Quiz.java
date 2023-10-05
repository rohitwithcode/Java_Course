package Chapter_10_Inheritence;

class Animal{

    public void Bark(){
        System.out.println("Animal is Bark....");
    }
    public  void Run(){
        System.out.println("Animal is Running....");
    }
}
class Cow extends Animal{

    public void Walk(){
        System.out.println("Cow is Walikin Now....");
    }
}
public class B_Inheritence_Quiz {
    public static void main(String[] args) {

        Cow cow=new Cow();

        cow.Walk();
        cow.Run();
        cow.Bark();

        System.out.println("Ok");
    }
}
