// Write a program of writing binary file using multithreading.
// Demonstrate use of join() and yield() interrupt()
/**
 * Q3
 */
import java.io.FileOutputStream;
import java.io.IOException;

public class Q3 extends Thread {
    private final String filename;
    private final byte[] data;

    public Q3(String filename, byte[] data) {
        this.filename = filename;
        this.data = data;
    }

    @Override
    public void run() {
        System.out.println("Writing to file: " + filename);
        try (FileOutputStream fos = new FileOutputStream(filename)) {
            fos.write(data);
            System.out.println("Write to file " + filename + " complete.");
        } catch (IOException e) {
            System.err.println("Error writing to file " + filename);
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String filename = "output.bin";
        byte[] data = { 0, 1, 2, 3, 4, 5 }; // Sample data

        // Create and start the writer threads
        Q3 thread1 = new Q3(filename, data);
        Q3 thread2 = new Q3(filename, data);
        thread1.start();
        thread2.start();

        // Demonstrate the use of join()
        try {
            thread1.join(); // Wait for thread1 to finish
            thread2.join(); // Wait for thread2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Demonstrate the use of yield()
        Thread.currentThread().yield(); // Give up CPU time to other threads

        // Demonstrate the use of interrupt()
        thread2.interrupt(); // Interrupt thread2
    }
}
