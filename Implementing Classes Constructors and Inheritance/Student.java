import java.util.Scanner;

class Student
{
    int studentID;
    String studentName;
    String course;
    double aas;
    double java;
    double python;

    // Default Constructor
    Student()
    {
        studentID = 0;
        studentName = "Unknown";
        course = "Not Assigned";
        aas = 0;
        java = 0;
        python = 0;
    }

    // Parameterized Constructor
    Student(int id, String name, String c, double a, double j, double p)
    {
        studentID = id;
        studentName = name;
        course = c;
        aas = a;
        java = j;
        python = p;
    }

    // Accept details from user
    void acceptDetails()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        studentID = sc.nextInt();

        System.out.print("Enter Student Name: ");
        studentName = sc.next();

        System.out.print("Enter Course: ");
        course = sc.next();

        System.out.print("Enter AAS marks: ");
        aas = sc.nextDouble();

        System.out.print("Enter JAVA marks: ");
        java = sc.nextDouble();

        System.out.print("Enter Python marks: ");
        python = sc.nextDouble();
    }

    // Calculate total
    double calculateTotal()
    {
        return aas + java + python;
    }

    // Calculate percentage
    double calculatePercentage()
    {
        return (calculateTotal() / 300) * 100;
    }

    // Display details
    void displayDetails()
    {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Course: " + course);
        System.out.println("AAS Marks: " + aas);
        System.out.println("JAVA Marks: " + java);
        System.out.println("Python Marks: " + python);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Percentage: " + calculatePercentage());
    }

    public static void main(String[] args)
    {
        // Object using default constructor
        Student s1 = new Student();

        System.out.println("----- Default Student -----");
        s1.displayDetails();

        // Object using parameterized constructor
        Student s2 = new Student(101, "Sherlyn", "BScCS", 80, 85, 90);

        System.out.println("\n----- Parameterized Student -----");
        s2.displayDetails();
    }
}