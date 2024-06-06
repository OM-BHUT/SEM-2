// Write a complete multi-threaded program to meet following
// requirements:
// a. Read matrix [A] m x n
// b. Create m number of threads
// c. Each thread computes summation of elements of one row, i.e.
// ith row of the matrix is processed by ith thread. Where 0 <=
// i< m.
/**
 * Q3
 */
import java.util.*;
public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter m");
        int m = sc.nextInt();
        System.out.println("enter n");
        int n = sc.nextInt();
        
        int[][] A = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                        
                A[i][j] = sc.nextInt();
            }
        }
        Thread[] t1 = new Thread[m];
        for(int i=0;i<m;i++){
            t1[i] = new Thread(new RowSummation(A[i], i));
            t1[i].start();
            
        }
    }
    
}
class RowSummation extends Thread{
    int[] rowSum;
    int rowNumber;
    public RowSummation(int[] rowSum,int rowNumber){
        this.rowSum = rowSum;
        this.rowNumber = rowNumber;
    }
    public void run(){
        int sum=0;
        for(int n : rowSum){
            sum+=n;
        }
        System.out.println("row sum= "+sum+"\nrow number= "+rowNumber);
    }
}