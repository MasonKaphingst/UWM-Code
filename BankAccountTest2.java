public class BankAccountTest2
{

    public static void main(String[] args)
    {
      
        System.out.printf("Account #%s has initial balance of $%.2f%n",
                first.getAccount(), first.getBalance());

        System.out.printf("Account #%s has initial balance of $%.2f%n",
                second.getAccount(), second.getBalance());

        
        first.transferFundsA(second, 5000);

       
        System.out.println("\nAfter \"first.transferFunds(second, 5000)\" ...");
        System.out.printf("Account #%s has new balance of $%.2f%n",first.getAccount(), first.getBalance());

        System.out.printf("Account #%s has new balance of $%.2f%n",second.getAccount(), second.getBalance());

       
        second.transferFundsB(first, 10000);

       
        System.out.println("\nAfter \"second.transferFunds(first, 10000)\" ...");
        System.out.printf("Account #%s has new balance of $%.2f%n",
                first.getAccount(), first.getBalance());

        System.out.printf("Account #%s has new balance of $%.2f%n",
                second.getAccount(), second.getBalance());
    }
}
