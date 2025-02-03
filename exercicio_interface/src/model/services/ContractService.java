package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	OnlinePaymentService payment;
	
	public ContractService(OnlinePaymentService payment) {
		this.payment = payment;
	}
	
	public void processContract(Contract contract, Integer months) {
		LocalDate baseDate = contract.getDate();
		LocalDate futureDate;
		
		Double totalPayment, baseValue = contract.getTotalValue()/months;
		for (Integer month = 0; month<months;month++) {
			futureDate = contract.getDate().plusMonths(month+1);
			totalPayment = payment.paymentFee(payment.interest(baseValue, month+1));
			contract.addInstallment(new Installment(futureDate, totalPayment));
		}
	}
}
