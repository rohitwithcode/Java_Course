package Chapter_15_FILE_IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class E_Character_Stream_C_Write_into_file_using_OutputStreamWriter {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        try {
            FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\Rohit Coder\\Desktop\\Java_File_Handling\\OutputStreamWriter.txt");
            OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fileOutputStream);

            System.out.println("Enter yout string here : ");
            String str=scanner.nextLine();

            outputStreamWriter.write(str);
            outputStreamWriter.close();
            System.out.println("Written in file successfully.....");
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
