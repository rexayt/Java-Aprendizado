package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Integer numero, parcelas;
		LocalDate data;
		Double valorDoContrato;
		Contract contrato;
		ContractService servicoDeContrato;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre os dados do contrato");
		System.out.print("Número: ");
		numero = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		sc.nextLine();
		data = LocalDate.parse(sc.nextLine(), dtf);
		System.out.print("Valor do contrato: ");
		valorDoContrato = sc.nextDouble();
		
		contrato = new Contract(numero, data, valorDoContrato);
		
		System.out.print("Entre com o número de parcelas: ");
		parcelas = sc.nextInt();
		
		servicoDeContrato = new ContractService(new PaypalService());
		servicoDeContrato.processContract(contrato, parcelas);
		
		for (Installment installment : contrato.getInstallments()) {
			System.out.println(installment.toString());
		}
		
		sc.close();
	}
	
}
