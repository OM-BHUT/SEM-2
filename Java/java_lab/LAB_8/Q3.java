// WAP to create Account class, which is representing a bank account
// where we can deposit and withdraw money. if we want to withdraw
// money which exceed our bank balance? We will not be allowed, create
// InSufficientFundException to handle above situation and display
// proper error message.
/**
 * Q3
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Q3 {

    public static void main(String[] args) {
        Account a1 = new Account();
        a1.withdrawMoney();
    }
}
class InSufficientFundException extends Exception{
    public InSufficientFundException(String a){
        super(a);
    }
}
class Account{
    public void withdrawMoney(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int accountBalance = 3000;
        int withdraw=0;
        while(flag){
        
        System.out.println("withdraw or deposit or see account balance");
        String ask = sc.nextLine();
        if(ask.equals("withdraw")){
            
            System.out.println("enter amount to withdraw");
            try {
                 withdraw = sc.nextInt();
            } catch (InputMismatchException e) {
                // TODO: handle exception
                System.out.println("invalid format of number");
            }
            
            sc.nextLine();
            try {
            
                if(withdraw>accountBalance){
                    throw new InSufficientFundException("not enough balance");
                }
                else{
                    accountBalance = accountBalance-withdraw;
                    System.out.println("money after withdraw= "+accountBalance);
                }
            } catch (InSufficientFundException e) {
                // TODO: handle exception
                System.out.println("not able to withdraw as you dont have enough balance"); 
            }
        }
        
        if(ask.equals("deposit")){
            System.out.println("enter money to deposit");
            int deposit = sc.nextInt();
            sc.nextLine();
            accountBalance+=deposit;
            System.out.println("money after deposit = "+accountBalance);
        }
        if(ask.equals("account balance")){
            System.out.println("Your Current account balance= "+accountBalance);
        }
        if(ask.equals("stop")){
            flag=false;
        }
    }
       
       
        
    }
}