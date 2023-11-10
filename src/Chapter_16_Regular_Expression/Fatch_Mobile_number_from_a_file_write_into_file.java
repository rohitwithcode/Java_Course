package Chapter_16_Regular_Expression;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fatch_Mobile_number_from_a_file_write_into_file {
    public static void main(String[] args) throws IOException {

            PrintWriter printWriter = new PrintWriter("C:\\Users\\Rohit Coder\\IdeaProjects\\Java_Course\\src\\Chapter_16_Regular_Expression\\output.txt");

            Pattern pattern=Pattern.compile("(0|91)?[6-9][0-9]{9}");
            BufferedReader bufferedReader=new BufferedReader(new FileReader("C:\\Users\\Rohit Coder\\IdeaProjects\\Java_Course\\src\\Chapter_16_Regular_Expression\\input.txt"));

            String readData=bufferedReader.readLine();

            while (readData != null){
                Matcher matcher=pattern.matcher(readData);
                while (matcher.find()){
                    printWriter.println(matcher.group());
                }
                readData=bufferedReader.readLine();
            }
            printWriter.flush();
            printWriter.close();
            bufferedReader.close();
    }
}
