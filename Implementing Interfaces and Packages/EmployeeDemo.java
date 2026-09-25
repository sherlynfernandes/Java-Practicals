import java.util.Scanner;

interface Employee {

    void calculateSalary();

    void displayDetails();
}

class Manager implements Employee {

    String name;
    int id;
    double salary;

    public void calculateSalary() {
        salary = salary + (salary * 0.20);
    }

    public void displayDetails() {

        System.out.println("\n--- Manager Details ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Developer implements Employee {

    String name;
    int id;
    double salary;

    public void calculateSalary() {
        salary = salary + (salary * 0.10);
    }

    public void displayDetails() {

        System.out.println("\n--- Developer Details ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Manager m = new Manager();

        System.out.print("Enter Manager ID: ");
        m.id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Manager Name: ");
        m.name = sc.nextLine();

        System.out.print("Enter Manager Salary: ");
        m.salary = sc.nextDouble();

        m.calculateSalary();
        m.displayDetails();


        Developer d = new Developer();

        System.out.print("\nEnter Developer ID: ");
        d.id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Developer Name: ");
        d.name = sc.nextLine();

        System.out.print("Enter Developer Salary: ");
        d.salary = sc.nextDouble();

        d.calculateSalary();
        d.displayDetails();
    }
}