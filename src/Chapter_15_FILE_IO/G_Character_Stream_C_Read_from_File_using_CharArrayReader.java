package Chapter_15_FILE_IO;

import java.io.CharArrayReader;
import java.io.FileReader;
import java.io.IOException;

public class G_Character_Stream_C_Read_from_File_using_CharArrayReader {
    public static void main(String[] args) {

        try {
//            FileReader fileReader=new FileReader("C:\\Users\\Rohit Coder\\Desktop\\Java_File_Handling\\CharArrayReader.txt");
            char [] arr={'R','O','H','I','T'};
            CharArrayReader charArrayReader=new CharArrayReader(arr);

            int data=charArrayReader.read();

            while (data != -1){
                System.out.print((char) data);
                data=charArrayReader.read();
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
