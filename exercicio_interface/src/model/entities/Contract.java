package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
	
	private Integer number;
	private LocalDate date;
	private Double totalValue;
	
	private List<Installment> installments = new ArrayList<>();
	
	public Contract(Integer number, LocalDate date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}
	
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getInstallments() {
		return this.installments;
	}

	public void addInstallment(Installment installment) {
		this.installments.add(installment);
	} 
	
	@Override
	public String toString() {
		return String.format("Número contrato: %d%nData contrato: %s%nValor do Contrato: %.2f%n", this.number, this.date, this.totalValue);
	}
	
}
