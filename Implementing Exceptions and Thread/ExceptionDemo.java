import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. ArithmeticException
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }

        // 2. ArrayIndexOutOfBoundsException
        try {
            int marks[] = {80, 70, 90};
            System.out.println(marks[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index.");
        }

        // 3. NumberFormatException
        try {
            String rollNo = "abc";
            int roll = Integer.parseInt(rollNo);
            System.out.println(roll);
        } catch (NumberFormatException e) {
            System.out.println("Marks must be numeric. Enter your roll number: abc");
        }

        // 4. InputMismatchException
        try {
            System.out.print("Enter an integer: ");
            int number = sc.nextInt();
            System.out.println("Number = " + number);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Please enter an integer.");
            sc.nextLine();
        }

        // 5. NullPointerException
        try {
            String studentName = null;
            System.out.println(studentName.length());
        } catch (NullPointerException e) {
            System.out.println("Student name is null.");
        }

        // 6. StringIndexOutOfBoundsException
        try {
            String name = "Java";
            System.out.println(name.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Invalid character index.");
        }

        // 7. IllegalArgumentException
        try {
            int marks = 150;

            if (marks < 0 || marks > 100) {
                throw new IllegalArgumentException();
            }

            System.out.println("Marks = " + marks);
        } catch (IllegalArgumentException e) {
            System.out.println("Marks must be between 0 and 100.");
        }

        sc.close();
    }
}
