package Chapter_15_FILE_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
       ******** FileInputStream ********

           1.FileInputStream is meant for reading streams of raw bytes.
           2.A FileInputStream obtains input bytes from a file int a file system.

        *********** CONSTRUCTORS **********

           1. FileInputStream(File file)
              -> Creates a FileInputStream by opening a connection to an actual fiel,
                 , file named by File object file in the file system.
           2. FileInputStream(String name)
              -> Creates a FileInputStream by opening a connection to an actual file,
                 file named by the path name in teh file system.
 */

public class A_Read_Data_From_File_using_FileInputStream {
    public static void main(String[] args) {
        System.out.println("********* THIS IS BYTE STREAM CLASS **********");
        try {
            File file=new File("C:\\Users\\Rohit Coder\\Desktop\\Java_File_Handling\\fileOutputStream2.txt");
            FileInputStream fileInputStream=new FileInputStream(file);

            int data=fileInputStream.read();
            while (data!= -1){
                System.out.print((char) data);
                data=fileInputStream.read();
            }
            fileInputStream.close();
        }catch (IOException e){
            System.out.println(e);
        }
        try {
            FileInputStream fileInputStream1=new FileInputStream("C:\\Users\\Rohit Coder\\Desktop\\Java_File_Handling\\fileOutputStream.txt");

            int data=fileInputStream1.read();
            System.out.println("");
            while (data!= -1){
                System.out.print((char) data);
                data=fileInputStream1.read();
            }
            fileInputStream1.close();
        }catch (IOException e1){
            System.out.println(e1);
        }
    }
}
