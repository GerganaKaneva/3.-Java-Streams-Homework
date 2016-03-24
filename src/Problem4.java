import java.io.*;

public class Problem4 {
    public static void main(String[] args) {

        try(
            BufferedInputStream bfis =
                    new BufferedInputStream(new FileInputStream("resources/my-picture.jpg"));
            BufferedOutputStream bfos =
                    new BufferedOutputStream(new FileOutputStream("resources/my-copied-picture.jpg"));
            ){
            int i;
            while ((i = bfis.read()) != -1){
                bfos.write(i);
            }
        }
        catch (IOException ioe){
            System.out.println();
        }
    }
}
