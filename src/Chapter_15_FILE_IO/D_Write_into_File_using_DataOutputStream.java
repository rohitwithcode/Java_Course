package Chapter_15_FILE_IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class D_Write_into_File_using_DataOutputStream {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        try {
            FileOutputStream fileOutputStream1=new FileOutputStream("C:\\Users\\Rohit Coder\\Desktop\\Java_File_Handling\\dataOutputStream.txt");
            DataOutputStream dataOutputStream=new DataOutputStream(fileOutputStream1);

            System.out.println("Enter your string : ");
            String str=scanner.nextLine();
            dataOutputStream.write(str.getBytes());
            dataOutputStream.close();

            System.out.println("Write Successful...");

        }catch (IOException e){
            System.out.println(e);
        }
    }
}
