package Chapter_11_Abstract_Classes_and_Interfaces;

interface Camera{
    void takePhoto();
    void recordVideo();
    void recordVideoSlowMo();
    void takePhotoBlur();
    private void Wish(){
        System.out.println("I Love Coding....\n\t\t\t\tGood Morning");
    }
    default void takePhotoHd(){
        Wish();
        System.out.println("Take Photo in HD ");
    }
}
interface Wifi{
    String [] getNetwork();
    void connectToNetwork(String network);
}

class CellPhone {
    void call(int number){
        System.out.println("Calling...."+number);
    }
    void takeCall(){
        System.out.println("Connecting....");
    }
}

class SmartPhone extends CellPhone implements Camera,Wifi{
    public void takePhoto(){
        System.out.println("Taking Photo");
    }
    public void recordVideo(){
        System.out.println("Record Video");
    }
    public void recordVideoSlowMo(){
        System.out.println("Record Slow Motion Video");
    }
    public void takePhotoBlur(){
        System.out.println("Take Photo in Blur");
    }
//    You can override this method is optional
//   public void takePhotoHd(){
//        System.out.println("Take Photo in HD ");
//    }
    public String [] getNetwork(){
        System.out.println("List of networks is given below....");
        String [] networkList={"Rohit","Coder","Radha"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }
}
public class C_Interfaces_using_Default_Method {
    public static void main(String[] args) {

        SmartPhone smartPhone=new SmartPhone();
        smartPhone.takePhotoHd();
        String [] ar=smartPhone.getNetwork();
        for (String i:ar){
            System.out.println(i);
        }
    }
}
