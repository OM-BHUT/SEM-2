// Create a thread by implementing the Runnable interface. The thread should print the message "Hello, Multithreading!" five times.

/**
 * Q2
 */
public class Q2 {

    public static void main(String[] args) {
        Hello h1 = new Hello();
        Thread t1 = new Thread(h1);
        t1.start();
        
    }
}

class Hello implements Runnable{
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello,Multithreading");
        }
    }
}