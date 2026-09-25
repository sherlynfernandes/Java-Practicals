class BankAccount
{
    long accountNumber;
    String accountHolderName;
    double balance;

    // Default Constructor
    BankAccount()
    {
        accountNumber = 0;
        accountHolderName = "Unknown";
        balance = 0.0;
    }

    // Parameterized Constructor
    BankAccount(long accNo, String name, double openingBalance)
    {
        accountNumber = accNo;
        accountHolderName = name;
        balance = openingBalance;
    }

    // Deposit money
    void deposit(double amount)
    {
        balance = balance + amount;
    }

    // Withdraw money
    void withdraw(double amount)
    {
        if(amount <= balance)
        {
            balance = balance - amount;
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }

    // Display balance
    void displayBalance()
    {
        System.out.println("Current Balance: " + balance);
    }

    // Display account details
    void displayAccountDetails()
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args)
    {
        // Object using default constructor
        BankAccount b1 = new BankAccount();

        System.out.println("----- Default Account -----");
        b1.displayAccountDetails();

        // Object using parameterized constructor
        BankAccount b2 = new BankAccount(123456789, "Sherlyn", 5000);

        System.out.println("\n----- Parameterized Account -----");
        b2.displayAccountDetails();

        // Deposit
        b2.deposit(2000);

        // Withdraw
        b2.withdraw(1500);

        // Display updated details
        System.out.println("\n----- Updated Account -----");
        b2.displayAccountDetails();
        b2.displayBalance();
    }
}