package Chapter_15_FILE_IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class F_Character_Stream_C_Read_from_File_using_BufferedReader {
    public static void main(String[] args) {

        try {
            FileReader fileReader=new FileReader("C:\\Users\\Rohit Coder\\Desktop\\Java_File_Handling\\BufferedWriter.txt");

            BufferedReader bufferedReader=new BufferedReader(fileReader);

            int data=bufferedReader.read();

            while (data != -1){
                System.out.print((char) data);
                data=bufferedReader.read();
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
