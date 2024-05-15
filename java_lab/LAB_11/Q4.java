// Refine the student manager program to manipulate the student
// information from files by using the DataInputStream and
// DataOutputStream. Assume suitable data

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Q4
 */
public class Q4 {

    public static void main(String[] args) {
        String nameOfFile = "abc1.txt";
        try {
            DataOutputStream fO1 = new DataOutputStream(new FileOutputStream(nameOfFile));
            fO1.writeUTF("jay");
            fO1.writeInt(18);
            fO1.writeUTF("dhruv");
            fO1.writeInt(20);
            fO1.writeUTF("karan");
            fO1.writeInt(19);
            fO1.close();

            DataInputStream fI1 = new DataInputStream(new FileInputStream(nameOfFile));
            int b;
            String name;
            int age;
            while((b=fI1.available())>0){
                name=fI1.readUTF();
                age=fI1.readInt();
                Student s1 = new Student(name, age);
                System.out.println(s1);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Student{
    String name;
    int age;
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return "name="+name+" age="+age;
    }
}