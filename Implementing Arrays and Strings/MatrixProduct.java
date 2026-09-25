import java.util.Scanner;

class MatrixProduct
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

        // Product of diagonal elements
        int diagonalProduct = 1;

        for(int i = 0; i < r; i++)
        {
            diagonalProduct = diagonalProduct * a[i][i];
        }

        System.out.println("Product of diagonal elements = " + diagonalProduct);

        // Product of each column
        for(int j = 0; j < c; j++)
        {
            int columnProduct = 1;

            for(int i = 0; i < r; i++)
            {
                columnProduct = columnProduct * a[i][j];
            }

            System.out.println("Product of column " + (j + 1) + " = " + columnProduct);
        }
    }
}