import java.util.*;

public class StudentResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter student name: ");
            String name = sc.next();

            int marks[] = new int[3];

            System.out.println("Enter marks of 3 subjects:");

            for (int i = 0; i < 3; i++) {
                marks[i] = sc.nextInt();
            }

            // Inner try-catch
            try {
                int numberOfSubjects = 3;

                int average = (marks[0] + marks[1] + marks[2])
                              / numberOfSubjects;

                System.out.println("Average = " + average);

            } catch (ArithmeticException e) {
                System.out.println("Cannot calculate average.");
            }

            // Another inner try-catch
            try {
                System.out.println("Subject marks = " + marks[5]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid subject index.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Please enter marks as numbers.");
        }

        sc.close();
    }
}
