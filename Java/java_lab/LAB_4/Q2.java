import java.util.Scanner;
public class Q2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a = sc.nextLine(), search=sc.nextLine();
        System.out.println(a);
        int index = a.indexOf(a);
        char b = 'a';

        while(index != -1){
            
           if(a.equals(b)){
            System.out.println(index);  
           }
            index++;
        }


    }
}