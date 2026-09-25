import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        double balance = 10000;
        double withdrawal;

        System.out.print("Enter account holder name: ");
        name = sc.nextLine();

        System.out.print("Enter withdrawal amount: ");
        withdrawal = sc.nextDouble();

        try {
            if (withdrawal > balance) {
                throw new IllegalArgumentException("Insufficient balance");
            }

            balance = balance - withdrawal;

            System.out.println("Account Holder: " + name);
            System.out.println("Withdrawal successful.");
            System.out.println("Remaining Balance = " + balance);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}