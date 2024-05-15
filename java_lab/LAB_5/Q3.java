// Create a class which ask the user to enter a sentence, and it should
// display count of each vowel type in the sentence. The program should
// continue till user enters a word “quit”. Display the total count of
// each vowel for all sentences
import java.util.Scanner;
public class Q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tA=0,tE=0,tI=0,tO=0,tU=0;
        while(true){
        int cA=0,cE=0,cI=0,cO=0,cU=0;
        System.out.println("enter");
        String a = sc.nextLine().toLowerCase();
        if(a.equals("quit")){
            break;
        }
        int length=a.length();
        for(int i=0;i<length;i++){
            
            char c = a.charAt(i);
            if(c=='a'){
                cA++;
                tA++;
            }
            if(c=='e'){
                cE++;
                tE++;
            }
            if(c=='i'){
                cI++;
                tI++;
            }
            if(c=='o'){
                cO++;
                tO++;
            }
            if(c=='u'){
                cU++;
                tU++;
            }
            System.out.println("Vowels of current sentence:");
            System.out.println(" A: "+cA+" E: "+cE+" I "+cI+" O: "+cO+" U: "+cU);
        }
        
        }
        System.out.println("Vowels total;:");
        System.out.println(" A : "+tA+" E: "+tE+" I "+tI+" O: "+tO+" U: "+tU);
    }
}

