public class MyPoint {
    private double x;
    private double y;

    // No-arg constructor
    public MyPoint() {
        this(0, 0);
        System.out.println("x in default con: "+x);
    }

    // Constructor with specified coordinates
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
        System.out.println("x in parameter con: "+x);
    }

    // Getter methods
    public double getX() {
        
        System.out.println("x in get: "+x);
        return x;
    }

    public double getY() {
        return y;
    }

    // Method to calculate distance between this point and another point of MyPoint type
    public double distance(MyPoint anotherPoint) {
        System.out.println("x in anotherPoint.getx(): "+anotherPoint.getX());
        System.out.println("ONLY x: "+x);
        return Math.sqrt(Math.pow(anotherPoint.getX() - x, 2) + Math.pow(anotherPoint.getY() - y, 2));
        
    }

    // Method to calculate distance between this point and specified x- and y-coordinates
    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public static void main(String[] args) {
        // Example usage:
        MyPoint point1 = new MyPoint(); // Creates a point at (0, 0)
        MyPoint point2 = new MyPoint(3, 4); // Creates a point at (3, 4)

        // Calculate distance between point1 and point2
        System.out.println("Distance between point1 and point2: " + point1.distance(point2));

        // Calculate distance between point1 and a specified point (5, 7)
        System.out.println("Distance between point1 and (5, 7): " + point1.distance(5, 7));
    }
}
