// Create a class called Student. Write a student manager program to
// manipulate the student information from files by using
// FileInputStream and FileOutputStream

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Q1
 */
public class Q4 {

    public static void main(String[] args) {
        try {
            String s1="abc.txt";
            FileWriter bw = new FileWriter(s1);
            bw.write("jay,20\n");
            bw.write("dhruv,18\n");
            bw.write("darshan,19\n");
            bw.close();

            BufferedReader br= new BufferedReader(new FileReader(s1));
            String b;
            String[] nameSeprater;
            String name;
            int age;
            while((b=br.readLine())!=null){
                nameSeprater = b.split(",");
                name=nameSeprater[0];
                age=Integer.parseInt(nameSeprater[1]);
                Student std1 = new Student(name, age);
                System.out.println(std1);
            }
            br.close();
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
        return "name= "+name+" age="+age;
    }
}

