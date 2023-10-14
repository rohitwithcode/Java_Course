package Chapter_15_FILE_IO;

import java.io.*;
import java.util.Scanner;

public class B_Write_into_File_using_BufferedOutputStream {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        //File file=new File("C:\\Users\\Rohit Coder\\Desktop\\Java_File_Handling\\ bufferedOutputStream.txt");
        try {
            FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\Rohit Coder\\Desktop\\Java_File_Handling\\bufferedOutputStream.txt");
            BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);

            System.out.println("Enter your string : ");
            String str=scanner.nextLine();

            bufferedOutputStream.write(str.getBytes());

            System.out.println("Write into file successfully...");
            bufferedOutputStream.close();
            fileOutputStream.close();
        }catch (IOException e){
            System.out.println(e);
        }

    }
}
