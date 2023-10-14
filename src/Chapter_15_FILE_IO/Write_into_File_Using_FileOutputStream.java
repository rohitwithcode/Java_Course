package Chapter_15_FILE_IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
/*
    1.FileOutputStream is meant for writing streams of raw bytes.
    2.FileOutputStream is subclass of OutputStream.

   ------------- Constructors ------------

   1.FileOutputStream(File file)
        -> Creates a file output stream to write to the file represented
        by the specified File object.
   2.FileOutputStream(File file,boolean append_data)
        -> Creates a file output stream to write to the file
            represented by the specified File object.
   3.FileOutputStream(String name)
        -> Creates a file output stream to write to the file with
           the specified name.
   4.FileOutStream(String name,boolean append_data)
        -> Creates a file output stream to write to the file
        with the specified name.
 */

public class Write_into_File_Using_FileOutputStream {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Rohit Coder\\Desktop\\Java_File_Handling\\fileOutputStream.txt");
            String s = "Coder";
            int i;
            char ch[] = s.toCharArray();
            for (i = 0; i < s.length(); i++) {
                fileOutputStream.write(ch[i]);
            }
            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        try {
            FileOutputStream fileOutputStream1 = new FileOutputStream("C:\\Users\\Rohit Coder\\Desktop\\Java_File_Handling\\fileOutputStream2.txt");

            System.out.println("Enter your string here : ");
            String str = scanner.nextLine();

//            fileOutputStream1.write(Integer.parseInt(str));
            fileOutputStream1.write(str.getBytes());
            fileOutputStream1.close();
        } catch (IOException e1) {
            System.out.println(e1);
        }
    }
}
