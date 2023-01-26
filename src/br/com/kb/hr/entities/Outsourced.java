package br.com.kb.hr.entities;

import java.math.BigDecimal;

public class Outsourced {

    private PersonalData personalData;
    private String company;

    public Outsourced(String name, String cpf, OfficePosition position, BigDecimal salary) {
        this.personalData = new PersonalData(name, cpf, position, salary);

        // TODO Auto-generated constructor stub
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return personalData.getName();
    }

    public String getCpf() {
        return personalData.getCpf();
    }

    public OfficePosition getPosition() {
        return personalData.getOfficePosition();
    }

    public BigDecimal getSalary() {
        return personalData.getSalary();
    }
}
