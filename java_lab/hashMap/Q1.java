package java_lab.hashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * Q1
 */
public class Q1 {

    public static void main(String[] args) {
        HashMap<String,Double> map= new HashMap<>();
        map.put("om", 328.0);
        map.put("yash", 306.0);
        Set<Map.Entry<String, Double>> entrySet = map.entrySet();
        System.out.println(entrySet);

        for(Map.Entry<String,Double> me: entrySet){
            System.out.println(me.getKey());
        }

    }
}