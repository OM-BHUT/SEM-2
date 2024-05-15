import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * PoolExecutor
 */
public class PoolExecutor {

    public static void main(String[] args) {
        Runnable r1=new Task("Task 1");
        Runnable r2=new Task("Task 2");
        Runnable r3=new Task("Task 3");
        Runnable r4=new Task("Task 4");
        Runnable r5=new Task("Task 5");
        ExecutorService pool = Executors.newFixedThreadPool(3);
        pool.execute(r1); 
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);
        
    }
}
class Task extends Thread implements Runnable {
    String name;
    public Task(String s){
        name=s;
    }
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println(name+" of thread number "+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                
            }
        }
    }
}