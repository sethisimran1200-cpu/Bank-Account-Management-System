
public class Main {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(
            "101", "Rahul", 5000
        );
        BankAccount account2 = new BankAccount(
            "102", "Priya", 10000
        );
        System.out.println("----- Account 1 -----");
        account1.deposit(2000);
        account1.withdraw(1000);
        account1.checkBalance();
        account1.displayDetails();
        System.out.println("\n----- Account 2 -----");
        account2.deposit(3000);
        account2.withdraw(2000);
        account2.checkBalance();
        account2.displayDetails();
    }
}
