import java.util.Scanner;
public class Q7{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter no.");
            int n = sc.nextInt();
            for(int i=1;i<=5*n/3;i++){
                for(int j=1;j<=n;j++){
                    if(i%j==0){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                    
                }
                System.out.print("\n");
            }
        }
    }
}
