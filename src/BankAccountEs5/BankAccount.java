package BankAccountEs5;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String clientName;

    public BankAccount(int accountNumber, int balance, String clientName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.clientName = clientName;
    }
}
