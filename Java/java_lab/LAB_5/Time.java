public class Time {
    public static void main(String[] args) {
        Time1 t1=new Time1(4,55,55);
        Time1 t2=new Time1(5,6,55);
        t1.add(t2);
        t1.displayTime();
    }
}
class Time1{
    int hour;
    int minute;
    int second;
    public Time1(int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public void add(Time1 temp){
        this.second+=temp.second;
        if(second>=60){
            this.minute++;
            this.second-=60;
        }
        this.minute+=temp.minute;
        if(minute>=60){
            this.hour++;
            this.minute-=60;
        }
        this.hour+=temp.hour;
    }
    public void displayTime(){
        System.out.println("hour="+this.hour);
        System.out.println("minute="+this.minute);
        System.out.println("second="+this.second);
    }
}
