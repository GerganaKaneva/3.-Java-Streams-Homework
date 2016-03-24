package Problem6;

import java.io.Serializable;

public class Course implements Serializable{
    private String name;
    private  int numStudents;

    public Course(String name, int numStudents){
        this.setName(name);
        this.setNumStudents(numStudents);
    }

    public String getName(){

        return name;
    }

    public void setName(String name){this.name = name;}

    public int getNumStudents() {

        return numStudents;
    }

    public  void setNumStudents(int numStudents) {
        this.numStudents = numStudents;
    }

    public  String toString() {

        return "Name of the course: " + this.getName()
                + ", Number of students: "
                + this.getNumStudents();
    }
}
