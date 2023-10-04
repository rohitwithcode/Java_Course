package Chapter_8_OOPs;

class Tommy{
    public void Hitting(){
        System.out.println("Hitting.....");
    }
    public void Running(){
        System.out.println("Running.....");
    }
    public void Firing(){
        System.out.println("Firing.....");
    }
}

public class Z_Question_4 {
    public static void main(String[] args) {

        Tommy t=new Tommy();

        t.Hitting();
        t.Running();
        t.Firing();
    }
}
