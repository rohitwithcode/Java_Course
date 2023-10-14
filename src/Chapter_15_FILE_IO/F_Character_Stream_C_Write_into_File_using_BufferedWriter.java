package Chapter_15_FILE_IO;

import java.io.*;
import java.util.Scanner;

public class F_Character_Stream_C_Write_into_File_using_BufferedWriter {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        try {
            FileWriter fileWriter=new FileWriter("C:\\Users\\Rohit Coder\\Desktop\\Java_File_Handling\\BufferedWriter.txt");
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);

            System.out.println("Enter your stirng here : ");
            String  str=scanner.nextLine();

            bufferedWriter.write(str);
            bufferedWriter.close();
            fileWriter.close();

            System.out.println("Write into file successfully.....");
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
