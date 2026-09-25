class BankAccountArray
{
    long accountNumber;
    String accountHolderName;
    double balance;

    // Default Constructor
    BankAccountArray()
    {
        accountNumber = 0;
        accountHolderName = "Unknown";
        balance = 0.0;
    }

    // Parameterized Constructor
    BankAccountArray(long accNo, String name, double openingBalance)
    {
        accountNumber = accNo;
        accountHolderName = name;
        balance = openingBalance;
    }

    // Deposit
    void deposit(double amount)
    {
        balance = balance + amount;
    }

    // Withdraw
    void withdraw(double amount)
    {
        if(amount <= balance)
        {
            balance = balance - amount;
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }

    // Display Balance
    void displayBalance()
    {
        System.out.println("Current Balance: " + balance);
    }

    // Display Account Details
    void displayAccountDetails()
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args)
    {
        // Array of 5 BankAccount objects
        BankAccount[] accounts = new BankAccount[5];

        // Creating 5 customer objects
        accounts[0] = new BankAccount(101, "Sherlyn", 5000);
        accounts[1] = new BankAccount(102, "Rahul", 7000);
        accounts[2] = new BankAccount(103, "Riya", 6000);
        accounts[3] = new BankAccount(104, "John", 8000);
        accounts[4] = new BankAccount(105, "Ananya", 4000);

        // Deposit and withdrawal for Customer 1
        accounts[0].deposit(1000);
        accounts[0].withdraw(500);

        // Deposit and withdrawal for Customer 2
        accounts[1].deposit(2000);
        accounts[1].withdraw(1000);

        // Deposit and withdrawal for Customer 3
        accounts[2].deposit(1500);
        accounts[2].withdraw(500);

        // Deposit and withdrawal for Customer 4
        accounts[3].deposit(3000);
        accounts[3].withdraw(1000);

        // Deposit and withdrawal for Customer 5
        accounts[4].deposit(1000);
        accounts[4].withdraw(500);

        // Display all customer details
        System.out.println("===== CUSTOMER DETAILS =====");

        for(int i = 0; i < 5; i++)
        {
            System.out.println("\nCustomer " + (i + 1));
            accounts[i].displayAccountDetails();
        }
    }
}