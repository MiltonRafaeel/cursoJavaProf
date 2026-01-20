package services;

import entities.Employee;

public class SalaryService {

    //FORMA ERRADA
    TaxService taxService = new TaxService();
    PensionService pensionService = new PensionService();

    public Double netSalary(Employee emp) {
        return emp.getGrossSalary() - taxService.tax(emp.getGrossSalary()) - pensionService.discount(emp.getGrossSalary());
    }
}
