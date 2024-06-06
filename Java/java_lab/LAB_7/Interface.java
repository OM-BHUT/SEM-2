//Interface
import java.util.*;

public class Interface {
    public static void main(String[] args) {
        D obj = new D();
        obj.display();
    }
}
interface A{
    int i=10;
}
class B implements A{
    int j=20;
}
interface C extends A{
    int k = 30;

}
class D extends B implements C{
    void display(){
        System.out.println(i+j+k);
    }
}