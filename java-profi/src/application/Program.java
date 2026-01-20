package application;

import entities.Employee;
import services.SalaryService;
import services.TaxService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("name: ");
        String name = scan.nextLine();
        System.out.print("enter your gross salary: ");
        Double grossSalary = scan.nextDouble();

        Employee employee = new Employee(name, grossSalary);

        SalaryService salaryService = new SalaryService();

        Double netSalary = salaryService.netSalary(employee);
        System.out.printf("Salary liquid = %.2f", netSalary);

        scan.close();
    }
}
