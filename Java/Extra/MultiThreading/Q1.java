// Write a Java program that creates and starts a thread by extending the Thread class. The thread should print numbers from 1 to 10.

/**
 * Q1
 */
public class Q1 {

    public static void main(String[] args) {
        Print1to10 t1 = new Print1to10();
        t1.start();
    }
}

class Print1to10 extends Thread{
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}