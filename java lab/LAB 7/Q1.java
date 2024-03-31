// The abstract vegetable class has three subclasses named Potato,
// Brinjal and Tomato. Write a java program that demonstrates how to establish this class hierarchy. Declare one instance variable of
// type String that indicates the color of a vegetable. Crete and
// display instances of these objects. Override the toString() method
// of object to return a string with the name of vegetable and its
// color
import java.util.Scanner;
public class Q1 {
public static void main(String[] args) {
    Vegetable v1 = new Potato();
    v1.display("Brown");
    Vegetable v2 = new Brinjal();
    v2.display("Purple");
    Vegetable v3 = new Tomato();
    v3.display("Red");

}
    
}
abstract class Vegetable {
    abstract void display(String color);
}
class Potato extends Vegetable{
    void display(String color){
        System.out.println("color of potato:"+color);
    }
}
class Brinjal extends Vegetable{
    void display(String color){
        System.out.println("color of brinjal:"+color);
    }
}
class Tomato extends Vegetable{
    void display(String color){
        System.out.println("color of tomato:"+color);
    }
}