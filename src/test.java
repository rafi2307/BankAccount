public class test {
    public static void main(String[] args) throws Exception {
        BankAccount bankAccount = new BankAccount(100);
        try
        {
            bankAccount.deposit(50);
            System.out.println("Deposit $"+50);
        }
        catch (InvalidBalanceException e)
        {
            e.printStackTrace();
        }
        try
        {
            bankAccount.withdraw(200);
            System.out.println("withdraw $"+200);
        }
        catch (InvalidAmountException e)
        {
            e.printStackTrace();
        }
        try
        {
            bankAccount.withdraw(50);
            System.out.println("withdraw $"+50);
        }
        catch (InvalidAmountException e)
        {
            e.printStackTrace();
        }
        try
        {
            bankAccount.deposit(-10);
            System.out.println("Deposit $"+-10);
        }
        catch (InvalidBalanceException e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("Final balance is $"+bankAccount.getBalance());
            System.out.println("End of transaction.");
        }
    }
}
