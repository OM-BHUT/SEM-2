import java.util.Scanner;

public class Q4 {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        
        Bank_Account c = new Bank_Account();
        c.getAccountDetails();
        c.displayAccountDetails();
        
    }
}

class Bank_Account{
    
    Scanner sc1 = new Scanner(System.in);
    int accountNo;
    String username;
    String email;
    String accountType;
    double accountBalance;
    public void getAccountDetails(){
        
        System.out.println("Enter account number");
        accountNo = sc1.nextInt();
        sc1.nextLine();
        System.out.println("Enter username");
        username = sc1.nextLine();
        
        System.out.println("Enter email");
        email = sc1.nextLine();
        System.out.println("Enter account type");
        accountType = sc1.nextLine();
        System.out.println("Enter account balance");
        accountBalance = sc1.nextDouble();
        
        
    }
    public void displayAccountDetails(){
        System.out.println("Account number:" + accountNo);
        System.out.println("Username:" + username);
        System.out.println("E-mail:" + email);
        System.out.println("Account Type:" + accountType);
        System.out.println("Account Balance:" + accountBalance);

    }
}
