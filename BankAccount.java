class BankAccount
{
    public BankAccount(String acctNum, double initialBalance)
    {
        accountNum = acctNum;
        balance = initialBalance;
    }
    public void deposit(double amount)
    {
        double newBalance = balance + amount;
        balance = newBalance;				
    }
    public void withdraw(double amount)	
        double newBalance = balance - amount;
        balance = newBalance;			
    }
    public String getAccount()	
    {
        return accountNum;		
    public double getBalance()	
    {
        return balance;			
    }
    public void transferFundsA(BankAccount destination, double amount)
    {
        destination.balance = destination.balance + amount;
        
        this.balance = this.balance - amount;
    }
    public void transferFundsB(BankAccount destination, double amount)
    {
        destination.deposit(amount);	
        this.withdraw(amount);           
    }
}