import java.util.Scanner;
public class Q3{
    public static void main(String[] args){
      Scanner Sc = new Scanner (System.in);
      int a = Sc.nextInt();
      char ch = Sc.next().charAt(0);
      int b = Sc.nextInt();
    }
      if(ch=='+'){
        System.out.println(a+b);
      }
      if(ch=='-'){
        System.out.println(a-b);
      }
      if(ch=='*'){
        System.out.println(a*b);
      }
      if(ch=='/'){
        while(b==0){
            System.out.println("enter other value than 0:");
             b = Sc.nextInt();
        
      }
      System.out.println(a/b);
    }
}