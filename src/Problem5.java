import java.io.*;
import java.util.ArrayList;

public class Problem5 {

    private static ArrayList<Double> doubles;

    public static void main(String[] args) {

        doubles = new ArrayList<>();
        doubles.add(6.6);
        doubles.add(36.9);
        doubles.add(2.7);

        saveObject();
        loadObject();

    }

    public static void saveObject() {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream("resources/doubles.list")))){
            oos.writeObject(doubles);
        }
        catch (IOException ioe) {
            System.out.println(ioe.toString());
        }
    }

    public static void loadObject() {
        try (ObjectInputStream ois = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream("resources/doubles.list")))){
            System.out.println("Doubles: " + ois.readObject());
        }
        catch (ClassNotFoundException | IOException cnne) {
            System.out.println(cnne.toString());
        }
    }
}

