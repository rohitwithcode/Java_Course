package Chapter_15_FILE_IO;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class H_Character_Stream_C_Write_into_File_Using_PrintWriter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try {
            //Data to write on Console using PrintWriter
//        PrintWriter writer = new PrintWriter(System.out);
//        writer.write("Javatpoint provides tutorials of all technology.");
//        writer.flush();
//        writer.close();
//Data to write in File using PrintWriter
            PrintWriter writer1 =null;
            writer1 = new PrintWriter(new File("C:\\Users\\Rohit Coder\\Desktop\\Java_File_Handling\\PrintWriter.txt"));
//            writer1.write("Like Java, Spring, Hibernate, Android, PHP etc.");
            System.out.println("Enter your string : ");
            String str=scanner.nextLine();
            writer1.write(str);
            writer1.flush();
            writer1.close();
            System.out.println("Written into file successfully.....");
        }catch (IOException e){
            System.out.println(e);
        }

    }
}