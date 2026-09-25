import java.util.Scanner;

class Series2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = 0;
        int sign = 1;

        for(int i = 1; i <= n; i = i + 2)
        {
            sum = sum + sign * i;
            sign = sign * -1;
        }

        System.out.println("Sum = " + sum);
    }
}