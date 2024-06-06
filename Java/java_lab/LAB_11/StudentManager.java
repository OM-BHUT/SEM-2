import java.io.*;

class Student implements Serializable {
    private String name;
    private int id;
    private double gpa;

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", GPA: " + gpa;
    }
}

public class StudentManager {

    public static void saveStudents(Student[] students) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("students.dat"))) {
            outputStream.writeObject(students);
            System.out.println("Students saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Student[] loadStudents() {
        Student[] students = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("students.dat"))) {
            students = (Student[]) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("John Doe", 1001, 3.8),
                new Student("Jane Smith", 1002, 3.9),
                new Student("Alice Johnson", 1003, 3.7)
        };

        saveStudents(students);

        Student[] loadedStudents = loadStudents();
        if (loadedStudents != null) {
            for (Student student : loadedStudents) {
                System.out.println(student);
            }
        } else {
            System.out.println("No students found.");
        }
    }
}
