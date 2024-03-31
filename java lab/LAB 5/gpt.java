import java.util.Scanner;

public class gpt {
    private int minutes;
    private int hours;
    private int seconds;

    public gpt() {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        minutes = sc1.nextInt();
        hours = sc2.nextInt();
        seconds = sc3.nextInt();

        while (minutes > 60) {
            System.out.println("invalid minutes");
            System.out.println("enter minutes again:");
            minutes = sc1.nextInt();
        }

        while (hours > 60) {
            System.out.println("invalid hours");
            System.out.println("enter valid hours:");
            hours = sc2.nextInt();
        }

        while (seconds > 60) {
            System.out.println("invalid seconds");
            System.out.println("enter valid seconds:");
            seconds = sc3.nextInt();
        }
    }

    public static void Time(int hours1, int minutes1, int seconds1, int hours2, int minutes2, int seconds2) {
        int totalHours = hours1 + hours2;   
        int totalMinutes = minutes1 + minutes2;
        int totalSeconds = seconds1 + seconds2;

        System.out.println("Total Time:");
        System.out.println("Hours: " + totalHours);
        System.out.println("Minutes: " + totalMinutes);
        System.out.println("Seconds: " + totalSeconds);
    }

    public static void main(String[] args) {
        gpt time1 = new gpt();
        gpt time2 = new gpt();
        Time(time1.hours, time2.hours, time1.minutes, time2.minutes, time1.seconds, time2.seconds);
    }
}
