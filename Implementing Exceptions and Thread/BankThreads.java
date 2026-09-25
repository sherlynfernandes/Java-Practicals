class Account {
    double balance = 10000;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }

    void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrawn: " + amount);
        System.out.println("Balance: " + balance);
    }
}

class Deposit extends Thread {

    Account account;

    Deposit(Account account) {
        this.account = account;
    }

    public void run() {
        account.deposit(5000);
    }
}

class Withdraw extends Thread {

    Account account;

    Withdraw(Account account) {
        this.account = account;
    }

    public void run() {
        account.withdraw(3000);
    }
}

public class BankThreads {
    public static void main(String[] args) {

        Account account = new Account();

        Deposit d = new Deposit(account);
        Withdraw w = new Withdraw(account);

        d.start();
        w.start();
    }
}