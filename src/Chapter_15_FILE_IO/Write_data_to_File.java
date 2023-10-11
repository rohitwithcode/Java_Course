package Chapter_15_FILE_IO;

import java.io.FileWriter;
import java.io.IOException;

public class Write_data_to_File {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter=new FileWriter("C:\\Users\\Rohit Coder\\Desktop\\Java_File_Handling\\myFirstFile.txt");
            fileWriter.write("I love coding\n\t\tI am enjoying coding");
            fileWriter.close();
            System.out.println("Write into a file Successfully");
        }catch (IOException e){
            System.out.println("Error Occurred..");
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
