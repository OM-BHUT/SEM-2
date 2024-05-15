// Write a program that merges a two files into single file
import java.io.*;

public class FileMerger {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java FileMerger <inputFile1> <inputFile2> <outputFile>");
            return;
        }

        String inputFile1 = args[0];
        String inputFile2 = args[1];
        String outputFile = args[2];

        mergeFiles(inputFile1, inputFile2, outputFile);

        System.out.println("Files merged successfully!");
    }

    public static void mergeFiles(String inputFile1, String inputFile2, String outputFile) {
        try (
            BufferedReader reader1 = new BufferedReader(new FileReader(inputFile1));
            BufferedReader reader2 = new BufferedReader(new FileReader(inputFile2));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;
            
            // Merge contents of inputFile1
            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            
            // Merge contents of inputFile2
            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error merging files: " + e.getMessage());
        }
    }
}
