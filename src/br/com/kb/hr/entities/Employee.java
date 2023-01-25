package br.com.kb.hr.entities;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import br.com.kb.hr.Exception;

public class Employee {

	private String name;
	private String cpf;
	private OfficePosition position;
	private BigDecimal salary;
	private LocalDate dateLastReadjustment;

	public Employee(String name, String cpf, OfficePosition position, BigDecimal salary) {
		this.name = name;
		this.cpf = cpf;
		this.position = position;
		this.salary = salary;
	}

	public void adjustSalary(BigDecimal increase) {
		BigDecimal percentageAdjustment = increase.divide(salary, RoundingMode.HALF_UP);
		if (percentageAdjustment.compareTo(new BigDecimal("0.4")) > 0) {
			throw new Exception("Adjustment cannot be more than 40% of salary!");
		}
		this.salary = this.salary.add(increase);
		this.dateLastReadjustment = LocalDate.now();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public OfficePosition getposition() {
		return position;
	}

	public void setPosition(OfficePosition position) {
		this.position = position;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public LocalDate getDateLastReadjustment() {
		return dateLastReadjustment;
	}

	public void setDateLastReadjustment(LocalDate dateLastReadjustment) {
		this.dateLastReadjustment = dateLastReadjustment;
	}

}
