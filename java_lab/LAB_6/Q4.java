// Design a class named MyPoint to represent a point with x and y coordinates. The class contains:
// a. The data fields x and y that represent the coordinates with
// getter methods.
// b. A no-arg constructor that creates a point (0, 0).
// c. A constructor that constructs a point with specified
// coordinates.
// d. A method named distance that returns the distance from this
// point to a specified point of the MyPoint type.
// e. A method named distance that returns the distance from this
// point to another point with specified x- and y-coordinates.
/**
 * Q4
 */

public class Q4 {

    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(3,4);
        System.out.println("distance between both the points="+p1.distance(p2));
        System.out.println("distance between two different points="+p1.distance(5, 7));
    }
}
class MyPoint{
    int x;
    int y;
    public MyPoint(){
        this(0,0);
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public MyPoint(int x,int y){
        this.x=x;
        this.y=y;
    }
    public double distance(MyPoint anotherPoint){
        return Math.sqrt(Math.pow(anotherPoint.getX()-this.x, 2) + Math.pow(anotherPoint.getY()-this.y, 2)); 
    }
    public double distance(int x,int y){
        return Math.sqrt(Math.pow(x-this.x, 2) + (Math.pow(y-this.y, 2)));
    }
}