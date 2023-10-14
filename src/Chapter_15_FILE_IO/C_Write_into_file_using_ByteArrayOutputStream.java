package Chapter_15_FILE_IO;
/*
        Java ByteArrayOutputStream class is used to write common data into multiple files.
         In this stream,
         the data is written into a byte array which can be written to multiple streams later.

         The ByteArrayOutputStream holds a copy of data and forwards it to multiple streams.

        The buffer of ByteArrayOutputStream automatically grows according to data.
 */
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class C_Write_into_file_using_ByteArrayOutputStream {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        try {
            FileOutputStream fileOutputStream1=new FileOutputStream("C:\\Users\\Rohit Coder\\Desktop\\Java_File_Handling\\byteArrayOutputStream1.txt");
            FileOutputStream fileOutputStream2=new FileOutputStream("C:\\Users\\Rohit Coder\\Desktop\\Java_File_Handling\\byteArrayOutputStream2.txt");

            ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();

            System.out.println("Enter your string : ");
            String str=scanner.nextLine();

//            byteArrayOutputStream.write("Rohit".getBytes());
            byteArrayOutputStream.write(str.getBytes());

            byteArrayOutputStream.writeTo(fileOutputStream1);
            byteArrayOutputStream.writeTo(fileOutputStream2);

            System.out.println("Write Successful.....");
            byteArrayOutputStream.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
