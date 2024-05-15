// WAP that counts the number of objects created using static.
import java.util.*;
public class Q6 {
    static int count=0;
    public static void main(String[] args){
        CountStatic a=new CountStatic();
        CountStatic b=new CountStatic();
        CountStatic c=new CountStatic();
        CountStatic d=new CountStatic();

        System.out.println("count="+count);
    }
}
class CountStatic{
    public CountStatic(){
       Q6.count++;
    }
}