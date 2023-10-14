package Chapter_15_FILE_IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class B_Read_From_File_using_BufferedInputStream {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        try {
            FileInputStream fileInputStream=new FileInputStream("C:\\Users\\Rohit Coder\\Desktop\\Java_File_Handling\\bufferedOutputStream.txt");
            BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);

            int data=bufferedInputStream.read();
            while (data!=-1){
                System.out.print((char) data);
                data=bufferedInputStream.read();
            }
            System.out.println("\n\nRead all content of file successfully....");
            bufferedInputStream.close();
            fileInputStream.close();
        }catch (IOException e){
            System.out.println(e);
        }

    }
}
