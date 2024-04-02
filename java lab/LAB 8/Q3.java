// WAP to create Account class, which is representing a bank account
// where we can deposit and withdraw money. if we want to withdraw
// money which exceed our bank balance? We will not be allowed, create
// InSufficientFundException to handle above situation and display
// proper error message.
/**
 * Q3
 */
public class Q3 {

    public static void main(String[] args) {
        
    }
}
class Account{
    double money;
    
    public Account(double money){
        this.money = money;
    }
    public void depositMoney(double newMoney){
        money = money + newMoney;
    }
}