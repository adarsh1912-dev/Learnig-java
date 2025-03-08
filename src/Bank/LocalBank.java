package Bank;

public class LocalBank {
    public static void main(String[] args) {
        BankAccount Acc1 = new BankAccount("1234","Adarsh",1000);
        Acc1.deposit(1000);
        Acc1.withdraw(100);
    }
}
