package br.com.kb.hr.services;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.kb.hr.Exception;
import br.com.kb.hr.entities.Employee;

public class ReadjustmentPeriodicity implements Readjustment {
    public void validate(Employee employee, BigDecimal increase) {
        LocalDate dateLastReadjustment = employee.getDateLastReadjustment();
        LocalDate now = LocalDate.now();

        long lastReadjustMonths = ChronoUnit.MONTHS.between(dateLastReadjustment, now);

        if (lastReadjustMonths < 6) {
            throw new Exception("Interval between readjustments should be at least six months");
        }
    }
}
