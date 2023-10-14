package Chapter_15_FILE_IO;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File file=new File("C:\\Users\\Rohit Coder\\Desktop\\Java_File_Handling\\myFirstFile.txt"); // for specify directory
//            File file1=new File("mySecondFile.java"); for same directory
            if (file.createNewFile()){
                System.out.println("File Exist : "+file.exists());
                System.out.println("File Created "+file.getName());
                System.out.println("File Length is : "+file.length());
            }
            else {
                System.out.println("File already exist...");
                System.out.println("File Length is : "+file.length());
//                System.out.println("File Deleted Successfully : "+file.delete());
            }
        }catch (IOException e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
