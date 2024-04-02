// Write a method for computing xy doing repetitive multiplication. X
// and y are of type integer and are to be given as command line
// arguments. Raise and handle exception(s) for invalid values of x
// and y.


/**
 * Q1
 */
public class Q1 {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = 1;
        try{
            for(int i=1;i<=y;i++){
                z=z*x;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(z);
    }
}