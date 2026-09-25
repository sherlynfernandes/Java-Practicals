import java.util.Scanner;

class Series1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        double sum = 0;

        for(int i = 1; i <= n; i++)
        {
            int fact = 1;

            for(int j = 1; j <= i; j++)
            {
                fact = fact * j;
            }

            sum = sum + ((double)(i * i) / fact);
        }

        System.out.println("Sum = " + sum);
    }
}