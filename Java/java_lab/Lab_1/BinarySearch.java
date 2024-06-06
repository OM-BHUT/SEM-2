import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {3,5,7,9,11,13,17};
        System.out.println("enter number to find");
        int n = sc.nextInt();
        boolean isFound=false;
        int low=0;
        int high=a.length-1;
        
        while(low<=high){
        int mid = (low+high)/2;
        if(n<a[mid]){
            high=mid;
        }
        else if(n>a[mid]){
            low=mid+1;
        }
        else{
            isFound=true;
            System.out.println("number is founded at "+mid);
            break;
        }

        
        }
        if(!isFound){
            System.out.println("number does not exist ");
        }
    }
}
