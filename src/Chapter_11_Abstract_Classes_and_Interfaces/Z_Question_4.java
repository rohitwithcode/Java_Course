package Chapter_11_Abstract_Classes_and_Interfaces;

interface tvRemote{
    void volume();
    void tvOn();
    void tvOff();

}
interface smartTvRemote extends tvRemote{
    void setBrightness();
    void setContrast();
}
class TV implements smartTvRemote{
    public void playMusic(){
        System.out.println("Playing Music.....");
    }
    public void playCricket(){
        System.out.println("Cricket is Playing.....");
    }
    public void volume(){
        System.out.println("Setting up the Volume");
    }
    public void tvOn(){
        System.out.println("Turning on the TV");
    }
    public void tvOff(){
        System.out.println("Turning off the TV");
    }
    public void setBrightness(){
        System.out.println("Setting up the Brightness");
    }
    public void setContrast(){
        System.out.println("Setting up the Contrast");
    }
}
public class Z_Question_4 {
    public static void main(String[] args) {

        TV tv=new TV();

        tv.volume();
        tv.tvOn();
        tv.tvOff();
        tv.setBrightness();
        tv.setContrast();
        tv.playMusic();
        tv.playCricket();
    }
}
