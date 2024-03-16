import java.util.Scanner;
public class Q1b{
    public static void main(String[] args){
      Scanner sc =new Scanner(System.in);
      System.out.println("enter radius of circle:");
      double radius = sc.nextDouble();
      Circle c = new Circle();
      double area = c.areaC(radius);
      System.out.println(area); 
    }

}
class Circle{
    int radius;
    public double areaC(double r){
        return Math.PI * r * r;
    }
}