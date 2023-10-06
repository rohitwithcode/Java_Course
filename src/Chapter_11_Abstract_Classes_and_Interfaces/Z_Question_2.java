package Chapter_11_Abstract_Classes_and_Interfaces;

class Monkey{
    public void jump(){
        System.out.println("Jumping....");
    }
    public void bite(){
        System.out.println("biting ....");
    }
}
interface Animal{
    void eat();
    void sleep();
}
class Human extends Monkey implements Animal{

    public void Think(){
        System.out.println("Human is Thinking....");
    }
    @Override
    public void eat() {
        System.out.println("Eating....");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping....");
    }
}

public class Z_Question_2 {
    public static void main(String[] args) {

        Human human=new Human();

        human.jump();
        human.bite();
        human.eat();
        human.sleep();
        human.Think();
    }
}
