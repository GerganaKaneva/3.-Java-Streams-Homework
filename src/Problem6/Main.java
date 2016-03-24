package Problem6;

import java.io.*;

public class Main {

    private static Course[] courses;

    public static void main(String[] args) {

        courses = new Course[3];
        courses[0] = new Course("Team work", 10);
        courses[1] = new Course("New Technologies", 20);
        courses[2] = new Course("German for beginners", 12);

        saveObject();
        loadObject();
    }

    private static void saveObject(){
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("resources/course.save")))) {
            for (Course c : courses) {
                oos.writeObject(c);
            }
        }
        catch (IOException ioe){
            System.out.println(ioe.toString());
        }
    }
    private static void loadObject(){
        try (ObjectInputStream ois = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream("resources/course.save")))) {
            Object obj;

            while ((obj = ois.readObject()) != null){
                System.out.println("Courses: " + obj);
            }
        }
        catch (EOFException eof){
            System.out.println("END OF FILE");
        }
        catch (ClassNotFoundException | IOException cnfe){
            System.out.println(cnfe.toString());
        }
    }

}
