package session7;

//ex. 5 5. Write a Java program to create a class known as "session7.BankAccount" with methods called deposit() and withdraw().
class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        displayBalance();
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds. Withdrawal not allowed.");
        }
        displayBalance();
    }

    // Method to display the account balance
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}
