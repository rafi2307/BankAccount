public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount( double balance) {
        this.accountNumber = "1870803683";
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double deposit) throws InvalidBalanceException {
        if (deposit <= 0) {
            throw new InvalidBalanceException("Invalid Balance!");
        }
        this.balance = balance + deposit;
    }

    public void withdraw(double withdraw) throws InvalidAmountException {
        if (withdraw < 0 || withdraw > balance) {
            throw new InvalidAmountException("Invalid amount!\n");
        }
        this.balance = balance - withdraw;
    }
}
