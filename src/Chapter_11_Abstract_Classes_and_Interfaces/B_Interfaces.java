package Chapter_11_Abstract_Classes_and_Interfaces;

interface Bicycle{
    int x=3;
    void applyBreak(int decrement);
    void speedUp(int increment);
}
interface Horn{
    void blowHorn();
    void blowHornS();
}
class Cycle implements Bicycle,Horn{
    void Horn(){
        System.out.println("Horn is loud...");
    }
    public void applyBreak(int decrement){
        System.out.println("Applying Brake....");
    }
    public void speedUp(int increment){
        System.out.println("Speed Up....");
    }
    public void blowHorn() {
        System.out.println("Pee Pee Pee");
    }
    public void blowHornS() {
        System.out.println("Radhey Radhey ....");
    }
}
public class B_Interfaces {
    public static void main(String[] args) {

        Cycle cycle=new Cycle();
        cycle.applyBreak(4);
        cycle.blowHorn();
        cycle.blowHornS();
        cycle.speedUp(2);

//        Bicycle bicycle=new Cycle();
//        bicycle.applyBreak(2);

//        You can create properties in interfaces
//        you cannot modify the properties in interfaces because they are final
        System.out.println("Property of interface : "+cycle.x);
    }
}
