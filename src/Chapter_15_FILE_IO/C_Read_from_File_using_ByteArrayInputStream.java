package Chapter_15_FILE_IO;
/*
        The ByteArrayInputStream is composed of two words:
        " ByteArray and InputStream".
         As the name suggests, it can be used to read byte array as input stream.

        Java ByteArrayInputStream class contains an internal buffer which is used to read byte array as stream.
         In this stream, the data is read from a byte array.

        The buffer of ByteArrayInputStream automatically grows according to data.
 */
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class C_Read_from_File_using_ByteArrayInputStream {
    public static void main(String[] args) {

        byte [] arr={4,4,6,4,45,3};

        ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream(arr);

        int data=byteArrayInputStream.read();

        while (data != -1){
            System.out.println( data);
            data=byteArrayInputStream.read();
        }

    }
}
