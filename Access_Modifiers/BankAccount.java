// Base class
class BankAccount {
    public String accountNumber;     // public
    protected String accountHolder;  // protected
    private double balance;          // private

    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public methods to access private balance
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance)
            balance -= amount;
    }

    public void display() {
        System.out.println("Account: " + accountNumber + ", Holder: " + accountHolder + ", Balance: ₹" + balance);
    }
}

// Subclass
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accNo, String holder, double balance, double rate) {
        super(accNo, holder, balance);
        this.interestRate = rate;
    }

    void displaySavingsDetails() {
        // Can access public and protected from superclass
        System.out.println("Savings Account: " + accountNumber + ", Holder: " + accountHolder + ", Rate: " + interestRate + "%");
    }
}
