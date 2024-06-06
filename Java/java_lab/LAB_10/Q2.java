// Write a program to replace all “word1” by “word2” from a file1,
// and output is written to file2 file and display the no. of
// replacement

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;

/**
 * Q2
 */
public class Q2 {

    public static void main(String[] args) {
        String word1 = "word1";
        String word2 = "word2";
        try{
        File f1 = new File("file1.txt") ;
        File f2 = new File("file2.txt");
        BufferedReader b1 = new BufferedReader(new FileReader(f1));
        BufferedWriter w1 =new BufferedWriter(new FileWriter(f2));
        int count=0;
        String a=b1.readLine();
        while (a!=null) {
            String changedString = "";
            String[] oldString = a.split("\\s+");
            for(int i=0;i<oldString.length;i++){
                if(oldString[i].equals(word1)){
                    count++;
                    changedString = changedString + word2+" ";
                }
                else{
                    changedString = changedString + word1 +" ";
                }

                
            }
            w1.write(changedString);
            w1.newLine();
            a=b1.readLine();

        }
        System.out.println("count="+count);
        b1.close();
        w1.close();
        
    }catch(Exception e){
        e.printStackTrace();
    }
    }
}