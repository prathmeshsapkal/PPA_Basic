// BankAccount class (logic class)
class BankAccount 
{
    String accountHolder;
    static int totalAccounts = 0;  // shared across all accounts

    BankAccount(String name)
    {
        accountHolder = name;
        totalAccounts++;  // shared counter increases
        System.out.println("Account created for " + accountHolder);
    }

    void showTotalAccounts() 
    {
        System.out.println("Total accounts in bank: " + totalAccounts);
    }

    static void showBankStats() 
    {
        System.out.println(">>> Bank has " + totalAccounts + " accounts.");
    }
}

// Main class to run the program
public class BankDemo
{
    public static void main(String[] args) 
    {
        BankAccount a1 = new BankAccount("Alice");
        BankAccount a2 = new BankAccount("Bob");
        BankAccount a3 = new BankAccount("Charlie");

        a2.showTotalAccounts();        // Using instance method
        BankAccount.showBankStats();   // Using static method
    }
}
