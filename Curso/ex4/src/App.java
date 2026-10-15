package ex4.src;

import java.util.Scanner;
import ex4.src.entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Name: ");
        employee.name = in.nextLine();
        System.out.println("Gross salary: ");
        employee.grossSalary = in.nextDouble();
        System.out.println("Tax: ");
        employee.tax = in.nextDouble();

        System.err.println("Employee: " + employee.toString());

        System.out.println("Which percentagem to increase salary ?");
        employee.increaseSalary(in.nextDouble());

        System.out.println("Updated data: " + employee.toString());

    }
}
