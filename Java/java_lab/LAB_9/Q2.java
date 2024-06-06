// Write a program to create two threads, one thread will print odd
// numbers and second thread will print even numbers between 1 to 20
// numbers
/**
 * Q2
 */
public class Q2 {

    public static void main(String[] args) {
        OddNumbers a = new OddNumbers();
        a.start();
        EvenNUmbers b = new EvenNUmbers();
        b.start();
    }
}
class OddNumbers extends Thread{
    public void run(){
        int i=1;
        while(true){
            System.out.println(i);

            i+=2;
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }
    }
}
class EvenNUmbers extends Thread{
    public void run(){
        int i=0;
        while(true){
            System.out.println(i);
            i+=2;
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }
    }
}