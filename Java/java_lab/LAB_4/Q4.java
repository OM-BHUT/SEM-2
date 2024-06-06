import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter size of arr:");
        n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter arr"+i);
            a[i] = sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            System.out.println(a[i]);
        }

    }

}
