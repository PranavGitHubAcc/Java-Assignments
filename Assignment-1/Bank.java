class Account {
    private String name;
    private int balance;

    public Account(String name) {
        this.name = name;
        this.balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println(amount + " deposited. New balance: " + this.balance);
        } else {
            System.out.println("Negative number entered.");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + this.balance);
        } else if (amount <= 0) {
            System.out.println("Negative number entered.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

class Customer {
    private String name;
    private Account account;

    public Customer(String name) {
        this.name = name;
        this.account = new Account(name + "_Account");
    }

    public String name() {
        return name;
    }

    public void deposit(int amount) {
        account.deposit(amount);
    }

    public void withdraw(int amount) {
        account.withdraw(amount);
    }

    public void displayAccountDetails() {
        System.out.println("Account details for " + this.name);
        System.out.println("Balance: " + account.getBalance());
    }
}

public class Bank {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe");

        customer.displayAccountDetails();

        System.out.println("Customer: " + customer.name());

        customer.deposit(1000);
        customer.withdraw(500);

        customer.displayAccountDetails();
    }
