import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Problem7 {

    public static void main(String[] args) {

        String[] multipleFiles = {"resources/words.txt", "resources/count-chars.txt", "resources/lines.txt"};

        try(
                ZipOutputStream zout = new ZipOutputStream(
                        new BufferedOutputStream(new FileOutputStream("resources/text-files.zip")));
        ){
            for (int i = 0; i < multipleFiles.length; i++) {

                FileInputStream fin = new FileInputStream(multipleFiles[i]);
                zout.putNextEntry(new ZipEntry(multipleFiles[i]));

                int lenght;

                while ((lenght = fin.read()) != -1){
                    zout.write(lenght);
                }

                zout.closeEntry();
                fin.close();
            }
            zout.close();
        }
        catch (FileNotFoundException fnfe){
            System.out.println(fnfe.toString());
        }
        catch (IOException ioe){
            System.out.println(ioe.toString());
        }
        }
    }

