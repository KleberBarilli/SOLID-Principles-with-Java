package br.com.kb.hr.services;

import java.math.BigDecimal;
import java.util.List;

import br.com.kb.hr.entities.Employee;

public class AdjustSalaryService {

    private List<Readjustment> validates;

    public AdjustSalaryService(List<Readjustment> validates) {
        this.validates = validates;
    }

    public void adjustSalary(Employee employee, BigDecimal increase) {
        this.validates.forEach((v -> v.validate(employee, increase)));
        BigDecimal adjustedSalary = employee.getSalary().add(increase);
        employee.updateSalary(adjustedSalary);
    }
}
