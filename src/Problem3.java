import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.io.*;

public class Problem3 {
    //Please write file path according to your location of words.txt.
    private  static final String FILE_PATH = "D:\\Documents\\SoftUni\\Fundamental Level\\Java Fundamentals\\03.Java-Streams\\3. Java-Streams-Homework\\words.txt";
    //Please write save path according to your location of count-chars.txt.
    private  static final String SAVE_PATH = "D:\\Documents\\SoftUni\\Fundamental Level\\Java Fundamentals\\03.Java-Streams\\3. Java-Streams-Homework\\count-chars.txt";

    public static void main(String[] args) throws IOException{

        File inputFile = new File(FILE_PATH);
        File outputFile = new File(SAVE_PATH);

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        String line = reader.readLine();
        char[] vowels = {'a', 'e','i', 'o', 'u' };
        char[] punctuationMarks = {'!', ',','.', '?' };
        int countVow = 0;
        int countCons = 0;
        int countPunct = 0;
        int wordsLenght = 0;

        while (line != null){

            String[] lineElements = line.split(" ");

            for (int i = 0; i < lineElements.length; i++) {

                char[] word = lineElements[i].toLowerCase().toCharArray();
                wordsLenght += word.length;

                for (int l = 0; l < word.length ; l++) {

                    for (int j = 0; j < vowels.length; j++) {

                        if (word[l] == vowels[j]){
                            countVow++;
                            break;
                        }
                    }

                    for (int k = 0; k < punctuationMarks.length; k++) {

                        if (word[l] == punctuationMarks[k]){
                            countPunct++;
                            break;
                        }
                    }
                }
            }

            countCons = wordsLenght - countPunct - countVow;

            FileWriter fw = new FileWriter(outputFile, false);
            PrintWriter writer = new PrintWriter(fw, true);

            writer.printf("Vowels: %d%n", countVow);
            writer.printf("Consonants: %d%n", countCons);
            writer.printf("Punctuation: %d%n", countPunct);

            line = reader.readLine();
            writer.close();
        }
        reader.close();
    }
}
