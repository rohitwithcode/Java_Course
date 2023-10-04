package Chapter_8_OOPs;

class CellPhone{
    public void Ringing(){
        System.out.println("CellPhone is Ringing\n\t\tPlease Pick the Phone");
    }
    public  void Vibrating(){
        System.out.println("CellPhone is Vibrating\n\t\tPlease Pick the Phone");
    }
}

public class Z_Question_2 {
    public static void main(String[] args) {

        CellPhone c=new CellPhone();

        c.Ringing();
        c.Vibrating();
    }
}
