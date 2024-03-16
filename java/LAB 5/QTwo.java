import java.util.Scanner;
public class QTwo{
    private Scanner sc1;
    private Scanner sc2;
    private Scanner sc3;
    private int minutes,hours,seconds;
    
    public QTwo(){
        sc1 = new Scanner(System.in);
        sc2 = new Scanner(System.in);
        sc3 = new Scanner(System.in);
        System.out.println("enter minutes");
        minutes = sc1.nextInt();             
            while(minutes>60){
               System.out.println("invalid minutes");
               System.out.println("enter minutes again:");
               minutes=sc1.nextInt();
           }
           System.out.println("enter hours:");
        hours = sc2.nextInt();     
            while (hours>60) {
                System.out.println("invalid hours");
                System.out.println("enter valid hours:");
                hours=sc2.nextInt();
            }
        System.out.println("enter seconds");
        seconds = sc3.nextInt();       
            while(seconds>60){
                System.out.println("invalid seconds");
                System.out.println("enter valid seconds");
                seconds=sc3.nextInt();
            }
        }
    public static void Time(QTwo t1,QTwo t2){       
        int totalHours=t1.hours + t2.hours;
        int totalMinutes= t1.minutes + t2.minutes;
        int totalSeconds= t1.seconds + t2.seconds;
       
        while(totalSeconds>60){
            totalSeconds=120-totalSeconds;
            totalMinutes++;
        }
        while(totalMinutes>60){
            totalMinutes = 120-totalMinutes;
            totalHours++;
        }
        while (totalHours>60) {
            totalHours = 120-totalHours;
            totalHours++;
        }
        System.out.println(totalHours+":" +totalMinutes+":"+totalSeconds );
        
    }

    public static void main(String[] args){     
          QTwo time1 = new QTwo();
          QTwo time2 = new QTwo();
          Time(time1,time2);
    }
   
    
}