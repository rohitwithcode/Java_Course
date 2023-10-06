package Chapter_11_Abstract_Classes_and_Interfaces;

abstract class telePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class smartTelephone extends telePhone{

    @Override
    void ring() {
        System.out.println("Ringing.....");
    }

    @Override
    void lift() {
        System.out.println("Lifting.....");
    }

    @Override
    void disconnect() {
        System.out.println("Disconnecting.....");
    }

    public void playYoutube(){
        System.out.println("Playing Youtube.....");
    }
    public void turnOnData(){
        System.out.println("Turning on the Data.....");
    }
}

public class Z_Question_3 {
    public static void main(String[] args) {

        telePhone telePhone=new smartTelephone();

        telePhone.lift();
        telePhone.ring();
        telePhone.disconnect();
//        telePhone.playYoutube(); // This will be throw an error because the reference of telePhone class and the object of the smartTelephone
//        telePhone.turnOnData();// This will be throw an error because the reference of telePhone class and the object of the smartTelephone
    }
}
