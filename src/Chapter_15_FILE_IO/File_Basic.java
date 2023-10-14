package Chapter_15_FILE_IO;
import java.io.*;
  /*
                                                            Streams in Java
                                                                   |
                                                                 /  \
                                                               /     \
                            ----------------------------------         -----------------------------------------------
                            1.Byte Stream                                                           2.Character Stream
                                   |                                                                       |
                                 /  \                                                                    /  \
                  --------------     ---------------------                                    ----------      ------------
                 1.Input Stream            2.Output Stream                                   1.Reader           2.Writer
                 A.BufferedInputStream     A.BufferedOutputStream                           A.BufferedReader    A.BufferedWriter
                 B.ByteArrayInputStream    B.ByteArrayOutputStream                          B.CharArrayReader   B.CharArrayWriter
                 C.DataInputStream         C.DataOutputStream                               C.FileReader        C.FileWriter
                 D.FileInputStream         D.FileOutputStream                               D.InputStreamReader D.InputStreamWriter
                 E.PrintStream                                                                                  E.PrintWriter
                 F.RandomAccessFile                                                         F.StringReader      F.StringWriter

                           */

import java.io.InputStreamReader;

public class File_Basic {
    public static void main(String[] args) {
        System.out.println("File Handling....");
    /*
    Whenever we run Java program, it is executed in RAM and hence
    we close Java and reopen it,the data i.e. the output is not saved.
    Till now we have used variables and arrays to store the data but:
    1. The data is lost when a variable goes out of scope or when the
       program is terminated.
    2.It is difficult to handle large amount of data using variables and
      arrays.
            Hence,to overcome this issue we use secondary storage devices like floppy disk,
            Hard disk to store data permanently. In secondary storage devices the data
            is stored in the format of files. Storing and managing data using files is known
            as FILE Processing or FILE Handling.
     */

    }
}
