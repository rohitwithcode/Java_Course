package Chapter_15_FILE_IO;
/*
        The CharArrayWriter class can be used to write common data to multiple files.
        This class inherits Writer class.
        Its buffer automatically grows when data is written in this stream.
 */
import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class G_Character_Stream_C_Write_into_File_using_CharArrayWriter {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        try {
            CharArrayWriter charArrayWriter=new CharArrayWriter();

            System.out.println("Enter yout string here : ");
            String str=scanner.nextLine();

            charArrayWriter.write(str);

            FileWriter fileWriter1=new FileWriter("C:\\Users\\Rohit Coder\\Desktop\\Java_File_Handling\\CharArrayWriter1.txt");
            FileWriter fileWriter2=new FileWriter("C:\\Users\\Rohit Coder\\Desktop\\Java_File_Handling\\CharArrayWriter2.txt");


            charArrayWriter.writeTo(fileWriter1);
            charArrayWriter.writeTo(fileWriter2);
            charArrayWriter.close();
            fileWriter2.close();
            fileWriter1.close();
            System.out.println("Write into file successful....");
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
