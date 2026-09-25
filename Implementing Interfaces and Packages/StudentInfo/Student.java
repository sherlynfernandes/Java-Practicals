package StudentInfo;

import java.util.Scanner;

public class Student {

    int studentId;
    String studentName;
    String course;
    double marks;

    Scanner sc = new Scanner(System.in);

    public void acceptDetails() {

        System.out.print("Enter Student ID: ");
        studentId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();

        System.out.print("Enter Course: ");
        course = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks = sc.nextDouble();
    }

    public String calculateGrade() {

        if (marks >= 90 && marks <= 100)
            return "A+";
        else if (marks >= 80)
            return "A";
        else if (marks >= 70)
            return "B";
        else if (marks >= 60)
            return "C";
        else
            return "D";
    }

    public void displayDetails() {

        System.out.println("\n--- Student Details ---");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}