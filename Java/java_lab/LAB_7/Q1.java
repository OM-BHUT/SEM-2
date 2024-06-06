// The abstract vegetable class has three subclasses named Potato,
// Brinjal and Tomato. Write a java program that demonstrates how to establish this class hierarchy. Declare one instance variable of
// type String that indicates the color of a vegetable. Create and
// display instances of these objects. Override the toString() method
// of object to return a string with the name of vegetable and its
// color
import java.util.Scanner;
public class Q1 {
public static void main(String[] args) {
    Vegetable v1 = new Potato();
    System.out.println(v1.toString());
    Vegetable v2 = new Brinjal();
    System.out.println(v2.toString());
    Vegetable v3 = new Tomato();
    System.out.println(v3.toString());

}
    
}
abstract class Vegetable {
    String color;
    
}
class Potato extends Vegetable{
    public String toString(){
        color="brown";
        return "color of potato="+color;
    }
}
class Brinjal extends Vegetable{
    public String toString(){
        color="purple";
        return "color of Brinjal= "+color;
    }
}
class Tomato extends Vegetable{
    public String toString(){
        color="red";
        return "color of Tomato= "+color;
    }
}