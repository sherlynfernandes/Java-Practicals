package department;

import company.Employee;
import java.util.Scanner;

public class Manager implements Employee {

    double basicSalary;

    public void calculateSalary() {

        double salary = basicSalary + (basicSalary * 0.20);

        System.out.println("Manager Salary: " + salary);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Manager m = new Manager();

        System.out.print("Enter basic salary: ");
        m.basicSalary = sc.nextDouble();

        m.calculateSalary();
    }
}