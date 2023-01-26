package br.com.kb.hr.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {

	private PersonalData personalData;
	private LocalDate dateLastReadjustment;

	public Employee(String name, String cpf, OfficePosition position, BigDecimal salary) {
		this.personalData = new PersonalData(name, cpf, position, salary);
	}

	public void updateSalary(BigDecimal newSalary) {
		this.personalData.setSalary(newSalary);
		this.dateLastReadjustment = LocalDate.now();
	}

	public void promote(OfficePosition newPosition) {
		this.personalData.setOfficePosition(newPosition);
	}

	public String getNome() {
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

	public LocalDate getDateLastReadjustment() {
		return dateLastReadjustment;
	}

}
