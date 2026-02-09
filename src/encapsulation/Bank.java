package encapsulation;

import java.util.Scanner;

class Account{ // fully encapsulated class as all variables are private.
    private String accountHolderName;
   private double accountBalance;

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void deposit(double amount) {
        if (amount>0) {
            accountBalance = accountBalance + amount;
            System.out.println("You have deposited " + amount + " and now you balance in account is: " + accountBalance);
        }else{
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount){
        if(amount>0){
            if(amount<=accountBalance) {
                accountBalance = accountBalance-amount;
                System.out.println("You have withdraw " + amount + " and now you balance in account is: " + accountBalance);
            }else{
                System.out.println("Insufficient balance in account!");
            }
        }else{
            System.out.println("Invalid withdraw amount");
        }
    }
}
public class Bank {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountHolderName("Nitish Kushwaha");
        Scanner sc= new Scanner(System.in);
            while (true)
            {
                System.out.println("Banking Service: 1. Deposit, 1.Withdraw, 3.Balance Inquiry, 4.Exit");
                System.out.println("Choose Options to continue");
                int op = sc.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("Enter amount to deposit:");
                        double depositAmount = sc.nextDouble();
                        account.deposit(depositAmount);
                        break;

                    case 2:
                        System.out.println("Enter amount to withdraw:");
                        double withdrawAmount = sc.nextDouble();
                        account.withdraw(withdrawAmount);
                        break;
                    case 3:
                        double currentBalance = account.getAccountBalance();
                        System.out.println("Total current balance in Account: " + currentBalance);
                        break;
                    case 4:System.exit(0);break;
                    default:
                        System.out.println("Invalid Option!");
                }
            }
    }
}
