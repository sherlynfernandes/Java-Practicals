abstract class Payment
{
    double amount;

    Payment(double amount)
    {
        this.amount = amount;
    }

    void displayReceipt()
    {
        System.out.println("Payment Amount: " + amount);
    }

    abstract void processPayment();
}


class CryptoPayment extends Payment
{
    String walletAddress;

    CryptoPayment(double amount, String wallet)
    {
        super(amount);
        walletAddress = wallet;
    }

    void processPayment()
    {
        System.out.println("Secure blockchain transfer completed.");
        System.out.println("Wallet Address: " + walletAddress);
    }


    public static void main(String[] args)
    {
        CryptoPayment payment = new CryptoPayment(
            5000,
            "0xABC123XYZ"
        );

        payment.displayReceipt();

        payment.processPayment();
    }
}