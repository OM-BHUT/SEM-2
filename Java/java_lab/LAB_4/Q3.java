import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        float count=0,sum=0;
        float avg;
        for(int i=0;i<4;i++){
            System.out.println("enter arr"+i);
            a[i]=sc.nextInt();
            count++;
            sum += a[i];
            
        }
        for(int i=0;i<4;i++){
            System.out.println(a[i]);
        }
        avg = sum/count;
        System.out.println("avg="+avg);

    }
    
}
