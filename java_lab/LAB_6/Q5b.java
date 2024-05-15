// Create a class named ThreeDPoint to model a point in a threedimensional space. Let ThreeDPoint be derived from MyPoint with
// following additional features:
// a. A data fields named z that represents the z-coordinate.
// b. A no-arg constructor that creates a point (0, 0, 0).
// c. A constructor that constructs a point with three specified
// coordinates.
// d. A get method that returns the z value.
// e. Override the distance method to return the distance between
// two points in the three-dimensional space.
// f. Write a program that creates two points (0, 0, 0) and (10,
// 30, 25.5) and display the distance between the two points.
/**
 * Q4
 */

 public class Q5b {

    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(3,4);
        ThreeDPoint p3 = new ThreeDPoint(10,30,25.5);
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
        return Math.sqrt(Math.pow(anotherPoint.getX()-x, 2) + Math.pow(anotherPoint.getY()-y, 2)); 
    }
    public double distance(int x,int y){
        return Math.sqrt(Math.pow(this.x-x, 2) + (Math.pow(this.y-y, 2)));
    }
}
class ThreeDPoint extends MyPoint{
    double z;
    public ThreeDPoint(){
        this(0,0,0);
    }
    public ThreeDPoint(int x,int y,double z){
        super(x,y);
        this.z=z;
    }
    public double getZ(){
        return z;
    }
    public double distance(ThreeDPoint anotherPoint){
        return Math.sqrt((Math.pow(anotherPoint.getX()-x, 2)) + (Math.pow(anotherPoint.y-y, 2)) + (Math.pow(anotherPoint.z-z, 2))); 
    }
}