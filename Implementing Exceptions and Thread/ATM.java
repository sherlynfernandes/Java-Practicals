class ATMTransaction implements Runnable {

    public void run() {
        try {
            System.out.println("Card Inserted");
            Thread.sleep(1000);

            System.out.println("PIN Verified");
            Thread.sleep(1000);

            System.out.println("Transaction Processing");
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}

class AccountNotification implements Runnable {

    public void run() {
        try {
            System.out.println("Checking Balance");
            Thread.sleep(1000);

            System.out.println("Amount Debited");
            Thread.sleep(1000);

            System.out.println("SMS Sent");
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}

public class ATM {
    public static void main(String[] args) {

        ATMTransaction transaction = new ATMTransaction();
        AccountNotification notification = new AccountNotification();

        Thread t1 = new Thread(transaction);
        Thread t2 = new Thread(notification);

        t1.start();
        t2.start();
    }
}