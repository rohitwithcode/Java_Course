package Chapter_11_Abstract_Classes_and_Interfaces;

interface Music{
    void playMusic();
}
interface PC{
    void E_Drive();
    void D_Drive();
    void C_Drive();
}
interface Coding_Ides{
    void vsCode();
    void intelliJ();
    void Eclipse();
    void netBeans();
}
class Laptop implements Music,PC,Coding_Ides{

    @Override
    public void playMusic() {
        System.out.println("Play Music");
    }

    @Override
    public void E_Drive() {
        System.out.println("E Drive");
    }

    @Override
    public void D_Drive() {
       System.out.println("D Drive");
    }

    @Override
    public void C_Drive() {
       System.out.println("C Drive");
    }

    @Override
    public void vsCode() {
       System.out.println("Start VS Code");
    }

    @Override
    public void intelliJ() {
        System.out.println("Start IntelliJ Idea");
    }

    @Override
    public void Eclipse() {
        System.out.println("Start Eclipse");
    }

    @Override
    public void netBeans() {
        System.out.println("Start NetBeans");
    }
    public void new_feature_Laptop(){
        System.out.println("I am new feature of the Laptop");
    }
}
public class E_Polymorphism_in_Interfaces {
    public static void main(String[] args) {

//        You can run only the method of the Music interface

        Music music=new Laptop();
//        music.intelliJ();// Not allowed
//        music.new_feature_Laptop(); // This is not Allowed because Reference of Music and Object of class Laptop
        music.playMusic();

//        You can run only the method of the PC interface

        PC pc=new Laptop();
//        pc.vsCode(); // This is not Allowed because Reference of PC and Object of class Laptop
//        music.new_feature_Laptop(); // This is not Allowed because Reference of PC and Object of class Laptop
        pc.C_Drive();
        pc.D_Drive();
        pc.E_Drive();

//        You can run only the method of the Coding_Ides interface

        Coding_Ides coding_ides=new Laptop();
//        coding_ides.C_Drive();// This is not Allowed because Reference of Coding_ides and Object of class Laptop
//        music.new_feature_Laptop(); // This is not Allowed because Reference of Coding_ides and Object of class Laptop
        coding_ides.Eclipse();
        coding_ides.intelliJ();
        coding_ides.netBeans();
        coding_ides.vsCode();

//          You can run all the methods of interfaces and class from create reference and object of the class

        Laptop laptop=new Laptop();
        laptop.playMusic();
        laptop.intelliJ();
        laptop.vsCode();
        laptop.Eclipse();
        laptop.netBeans();
        laptop.C_Drive();
        laptop.D_Drive();
        laptop.E_Drive();
        laptop.new_feature_Laptop();
    }
}
