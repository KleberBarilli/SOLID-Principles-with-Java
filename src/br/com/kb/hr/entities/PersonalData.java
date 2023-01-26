package br.com.kb.hr.entities;

import java.math.BigDecimal;

public class PersonalData {
    private String name;
    private String cpf;
    private OfficePosition position;
    private BigDecimal salary;

    public PersonalData(String name, String cpf, OfficePosition position, BigDecimal salary) {
        this.name = name;
        this.cpf = cpf;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public OfficePosition getOfficePosition() {
        return position;
    }

    public void setOfficePosition(OfficePosition position) {
        this.position = position;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
