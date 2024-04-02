// Write an application that executes two threads. One thread
// displays "Good Morning" every 1000 milliseconds & another thread
// displays "Good Afternoon" every 3000 milliseconds. Create the
// threads by implementing the Runnable interface

public class Q1 {
    public static void main(String[] args) {
        GoodMorning g1 = new GoodMorning();
        Thread t1 = new Thread(g1);
        t1.start();
        GoodAfterNoon g2 = new GoodAfterNoon();
        Thread t2 = new Thread(g2);
        t2.start();
    }
}
class GoodMorning implements Runnable{
    public void run(){
        while(true){
            System.out.println("Good Morning");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }
        }
    }
}
class GoodAfterNoon implements Runnable{
    public void run(){
        while(true){
            System.out.println("Good AfterNoon");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }
    }
}