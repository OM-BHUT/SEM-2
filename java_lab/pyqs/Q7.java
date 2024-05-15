import java.time.*;
public class Q7 {
    public static void main(String[] args) {
        LocalDate date= LocalDate.now();
        System.out.println(date);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        LocalTime time = LocalTime.now();
        System.out.println(time);
        int hour=time.getHour();
        System.out.println(hour);
        
    }
    
}