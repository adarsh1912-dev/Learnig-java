package Bank;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private long balance;


    public BankAccount(String accountNumber, String accountHolderName, long balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(long amount){
        if(amount<0){
            System.out.println("INVALID AMOUNT");
        }
        else {
         balance+=amount;
            System.out.println("Amount deposited");
            System.out.println("Current balance : " + balance);
        }

    }
    public void withdraw(long amount){
        if(amount < 0){
            System.out.println("INVALID AMOUNT");
        } else if (amount > balance) {
            System.out.println("LOW BALANCE");
        }
        else {
            System.out.println("TRANSACTION SUCCESSFUL");
            balance-=amount;
            System.out.println("Available Balance : " + balance);
        }
    }


}
