// Create a class named ThreeDPoint to model a point in a three-dimensional space.
// Let ThreeDPoint be derived from MyPoint with the following additional features:
// a. A data field named z that represents the z-coordinate.
// b. A no-arg constructor that creates a point (0, 0, 0).
// c. A constructor that constructs a point with three specified coordinates.
// d. A get method that returns the z value.
// e. Override the distance method to return the distance between two points in the three-dimensional space.
// f. Write a program that creates two points (0, 0, 0) and (10, 30, 25.5) and display the distance between the two points.

public class Q5gpt {

    public static void main(String[] args) {
        ThreeDPoint p1 = new ThreeDPoint();
        ThreeDPoint p2 = new ThreeDPoint(10, 30, 25.5);
        System.out.println(p1.distance(p2));
    }
}

class MyPoint {
    int x;
    int y;

    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(MyPoint anotherPoint) {
        return Math.sqrt(Math.pow(anotherPoint.getX() - x, 2) + Math.pow(anotherPoint.getY() - y, 2));
    }
}

class ThreeDPoint extends MyPoint {
    double z;

    public ThreeDPoint() {
        this(0, 0, 0);
    }

    public ThreeDPoint(int x, int y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    @Override
    public double distance(MyPoint anotherPoint) {
        if (anotherPoint instanceof ThreeDPoint) {
            ThreeDPoint point = (ThreeDPoint) anotherPoint;
            return Math.sqrt(Math.pow(point.getX() - x, 2) + Math.pow(point.getY() - y, 2) + Math.pow(point.getZ() - z, 2));
        } else {
            return super.distance(anotherPoint);
        }
    }
}
