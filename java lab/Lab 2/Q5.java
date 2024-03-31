import java.util.Scanner;
public class Q5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
     System.out.print("enter fahrenheit:");
     int f = sc.nextInt();
     System.out.println("c=" +((f-32)*5/9));
    }
}