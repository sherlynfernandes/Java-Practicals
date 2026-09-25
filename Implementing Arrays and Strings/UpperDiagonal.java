import java.util.Scanner;

class UpperDiagonal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();

        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        int a[][] = new int[r][c];

        System.out.println("Enter elements:");

        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Upper diagonal elements:");

        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                if(j > i)
                {
                    System.out.print(a[i][j] + " ");
                }
            }
        }
    }
}