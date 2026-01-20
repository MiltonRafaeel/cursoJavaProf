package services;

import entities.Employee;

public class SalaryService {

    //FORMA CERTA
    private TaxService taxService;
    private PensionService pensionService;

    public SalaryService(TaxService taxService, PensionService pensionService) {
        this.taxService = taxService;
        this.pensionService = pensionService;
    }

    public Double netSalary(Employee emp) {
        return emp.getGrossSalary() - taxService.tax(emp.getGrossSalary()) - pensionService.discount(emp.getGrossSalary());
    }
}
