import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Problem1 {
    //Please write file path according to your location of lines.txt.
    private static final String FILE_PATH = "D:\\Documents\\SoftUni\\Fundamental Level\\Java Fundamentals\\03.Java-Streams\\3. Java-Streams-Homework\\lines.txt";

    public static void main(String[] args) throws IOException{

        File file = new File(FILE_PATH);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = reader.readLine();

        while (line != null){
            int sum = 0;
            for (int i = 0; i < line.length(); i++) {
                char one = line.charAt(i);
                int codeOne = one;

                sum += codeOne;
            }
            System.out.println(sum);

            line = reader.readLine();
        }
    }
}
