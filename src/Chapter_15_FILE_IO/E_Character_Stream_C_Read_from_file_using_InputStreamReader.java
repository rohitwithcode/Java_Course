package Chapter_15_FILE_IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class E_Character_Stream_C_Read_from_file_using_InputStreamReader {
    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream=new FileInputStream("C:\\Users\\Rohit Coder\\Desktop\\Java_File_Handling\\OutputStreamWriter.txt");

            InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream);

            int data=inputStreamReader.read();

            while (data != -1){
                System.out.print((char) data);
                data=inputStreamReader.read();
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
