// Write an application that reads a file and counts the number of
// occurrences of digit 5. Supply the file name as a command-line
// argument

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 * Q3
 */
public class Q3 {

    public static void main(String[] args) {
        String oldFileName = "om.txt";
        String newFileName = args[0]+".txt";
        File oldFile = new File(oldFileName);
        File newFile = new File(newFileName);
        try {
            if(oldFile.renameTo(newFile)){
                System.out.println("file renamed");
            }
            else{
                System.out.println("file already exists");
            }
            BufferedReader b1 = new BufferedReader(new FileReader(newFile));
            int countFive=0;
            String b;
            
            while((b=b1.readLine())!=null) {
                char[] c = b.toCharArray(); // converts into array of character
                for(char c1:c){
                    if(c1 == '5'){
                        countFive++;
                    }
                }
                
            }
            System.out.println("number of five="+countFive);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}