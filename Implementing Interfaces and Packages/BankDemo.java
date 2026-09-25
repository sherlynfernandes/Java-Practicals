import java.util.Scanner;

interface Account {

    void deposit();

    void withdraw();

    void checkBalance();
}

class SavingsAccount implements Account {

    double balance;
    Scanner sc = new Scanner(System.in);

    public void deposit() {

        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();

        balance = balance + amount;

        System.out.println("Amount deposited successfully.");
    }

    public void withdraw() {

        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount <= balance) {

            balance = balance - amount;

            System.out.println("Amount withdrawn successfully.");

        } else {

            System.out.println("Insufficient balance.");
        }
    }

    public void checkBalance() {

        System.out.println("Current Balance: " + balance);
    }
}

public class BankDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SavingsAccount account = new SavingsAccount();

        System.out.print("Enter initial balance: ");
        account.balance = sc.nextDouble();

        int choice;

        do {

            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    account.deposit();
                    break;

                case 2:
                    account.withdraw();
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);
    }
}