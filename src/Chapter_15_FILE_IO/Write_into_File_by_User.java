package Chapter_15_FILE_IO;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Write_into_File_by_User {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try {
            FileWriter fileWriter=new FileWriter("C:\\Users\\Rohit Coder\\Desktop\\Java_File_Handling\\writeByUser.txt");

            System.out.print("Enter your string here : ");
            String user=scanner.nextLine();

            fileWriter.write(user);
            fileWriter.close();
            System.out.println("Write into file successfully");
        }catch (IOException e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
