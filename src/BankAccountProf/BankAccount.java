package BankAccountProf;

/**
 A bank account has a balance that can be changed by deposits and withdrawals.
 */

public class BankAccount {
    /**
     * Constructs a bank account with a zero balance.
     */
    public BankAccount() {
        balance = 0;
    }

    /**
     * Constructs a bank account with a given balance.
     *
     * @param initialBalance the initial balance
     */

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    /**
     * 25: Deposits money into the bank account.
     * 26: @param amount The amount to deposit
     * 27:
     */
    public void deposit(double amount) {
        double newBalance = balance + amount;
        balance = newBalance;
    }


    public void withdraw(double amount)
    {
         double newBalance = balance - amount;
         balance = newBalance;
    }

    public double getBalance()
    {
         return balance;
    }

    private int accountNumber;
    private double balance;
}

