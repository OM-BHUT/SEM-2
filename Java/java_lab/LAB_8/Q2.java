// Write a complete program to accept N integer numbers from the
// command line. Raise and handle exceptions for following cases :
// a. - when a number is –ve
// b. - when a number is evenly divisible by 10
// c. - when a number is greater than 1000 and less than 2000
// d. - when a number is greater than 7000
// Skip the number if an exception is raised for it, otherwise add it
// to find total sum.
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        for(int i=1;i<=n;i++){
            try{
                System.out.println("enter your integer number:"+i);
                int number = sc.nextInt();
                    if(number<0){
                   throw new NegativeNumberException("number is negative:"+number);        
                }
                    else if(number%10 == 0){
                        throw new EvenlyDivisibleException("number is evenly divisible:"+number);
                    }
                    else if (number>1000 && number<2000) {
                        throw new NumberInRange("Number is in Range:"+number);
                    }
                    else if(number>7000){
                        throw new NumberOutOfRange("Number is out of reange:"+number);
                    }           
                    sum+=number;
            
            
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage() + " skipping ");
        } catch (EvenlyDivisibleException e) {
            System.out.println(e.getMessage() + " skipping ");
        } catch (NumberInRange e) {
            System.out.println(e.getMessage() + " skipping ");
        } catch (NumberOutOfRange e) {
            System.out.println(e.getMessage() + " skipping ");
        }
    }
        System.out.println("sum is"+sum);
    }
}
class NegativeNumberException extends Exception{
    public NegativeNumberException(String a){
        super(a);
    }
}
class EvenlyDivisibleException extends Exception{
    public EvenlyDivisibleException(String a){
        super(a);
    }
}
class NumberInRange extends Exception{
    public NumberInRange(String a){
        super(a);
    }
}
class NumberOutOfRange extends Exception{
    public NumberOutOfRange(String a){
        super (a);
    }
}