package Chapter_11_Abstract_Classes_and_Interfaces;

abstract class Pen{
    abstract void write();
    abstract void refill();
}
class ballPen extends Pen{

    public void chageRefill(){
        System.out.println("Refill Changed");
    }
    @Override
    void write() {
        System.out.println("Writing .....");
    }

    @Override
    void refill() {
        System.out.println("Refill color is Black");
    }
}
public class Z_Question_1 {
    public static void main(String[] args) {

        ballPen ballPen=new ballPen();

        ballPen.chageRefill();
        ballPen.refill();
        ballPen.write();
    }
}
