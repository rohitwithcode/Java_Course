package Chapter_15_FILE_IO;

import java.io.FileReader;
import java.io.IOException;

public class Read_Data_From_File_Using_fileReader_Class {
    public static void main(String[] args) {

        try {
            FileReader fileReader=new FileReader("C:\\Users\\Rohit Coder\\Desktop\\Java_File_Handling\\writeByUser.txt");
//            int i;
//            while ((i=fileReader.read()!=-1){
//                System.out.println((char) i);
//            }
            int data=fileReader.read();
            while (data != -1){
                System.out.print((char) data);
                data=fileReader.read();
            }
            fileReader.close();
        }catch (IOException e){
            System.out.println(e);
            e.printStackTrace();
        }

    }
}
