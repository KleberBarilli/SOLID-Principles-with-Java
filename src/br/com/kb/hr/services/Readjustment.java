package br.com.kb.hr.services;

import java.math.BigDecimal;

import br.com.kb.hr.entities.Employee;

public interface Readjustment {
    public void validate(Employee employee, BigDecimal increase);
}
