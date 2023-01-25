package br.com.kb.hr.services;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.kb.hr.Exception;
import br.com.kb.hr.entities.Employee;

public class PercentageReadjust implements Readjustment {
    public void validate(Employee employee, BigDecimal increase) {
        BigDecimal salary = employee.getSalary();
        BigDecimal percentageAdjustment = increase.divide(salary, RoundingMode.HALF_UP);
        if (percentageAdjustment.compareTo(new BigDecimal("0.4")) > 0) {
            throw new Exception("Adjustment cannot be more than 40% of salary!");
        }
    }
}
