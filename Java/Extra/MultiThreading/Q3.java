// Write a Java program that creates a thread which prints the current time every second for five seconds. Use Thread.sleep(1000) to pause execution.

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Q3
 */
public class Q3 {

    public static void main(String[] args) {
        System.out.println("Current Time"); 
        
        try {
            
            for (int i = 0; i < 5; i++) {
                
                LocalTime t1 = LocalTime.now();
                System.out.println(t1);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}