// Write a program to check that the given number is prime or not
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        boolean flag=false;
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=true;
                break;
            } 
        }
        if(flag==true){
            System.out.println("entered number is not prime");        
        }
        else{
            System.out.println("prime");
        }
    }
    
}
