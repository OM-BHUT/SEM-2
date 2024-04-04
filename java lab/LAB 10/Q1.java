import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Q1b
 */
public class Q1 {

    public static void main(String[] args) {
        try{
        File f1 = new File("E:\\SEM-2\\java lab\\LAB 10\\hello.txt");

        if(!f1.exists()){
            throw new FileNotFoundException("File not exists");
        }
        BufferedReader f2 = new BufferedReader(new FileReader(f1));
        int countCharacters=0;
        int countWords=0;
        int countLines=0;
        String b;
        String[] words;
        while((b=f2.readLine())!=null){
            countLines++;
            words=b.trim().split("\\s+");
            countWords+=words.length;
            countCharacters+=b.length();
        }
        System.out.println("No of characters="+countCharacters+" No of words="+countWords+" No of lines="+countLines);
        f2.close();
    }catch(Exception e){
        e.getMessage();
    }
    }
}