import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            int marks[] = new int[3];

            System.out.println("Enter marks of 3 subjects:");

            for (int i = 0; i < 3; i++) {
                marks[i] = sc.nextInt();
            }

            int numberOfSubjects = 3;

            // Average
            int average = (marks[0] + marks[1] + marks[2]) / numberOfSubjects;

            System.out.println("Average = " + average);

            // Invalid array index
            System.out.println(marks[5]);

            // String conversion
            String value = "abc";
            int number = Integer.parseInt(value);

        } catch (InputMismatchException e) {
            System.out.println("Please enter marks as numbers.");
        } catch (ArithmeticException e) {
            System.out.println("Cannot calculate average because number of subjects is zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid marks array index.");
        } catch (NumberFormatException e) {
            System.out.println("Marks entered as a string are not numeric.");
        }

        sc.close();
    }
}
