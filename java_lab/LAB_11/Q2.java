// Write a program to check that whether the name given from command
// line is file or not? If it is a file then print the size of file
// and if it is directory then it should display the name of all
// files in it.

import java.io.File;

/**
 * Q2
 */
public class Q2 {

    public static void main(String[] args) {
        File f1 = new File(args[0]);
        if(!f1.exists()){
            System.out.println("File not exists");
        }
        if(f1.isFile()){
            System.out.println("file");
        }
        else if(f1.isDirectory()){
            System.out.println("Directory");
            System.out.println("given below list of directories");
            File[] files = f1.listFiles();
            for(File file:files){
                System.out.println(file.getName());
            }
        }
        else{
            System.out.println("its neither a file nor a directory");
        }
    }
}