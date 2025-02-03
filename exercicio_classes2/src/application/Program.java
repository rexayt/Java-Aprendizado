package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		/*Declaração de variáveis, e da lista.*/
		Integer employeesNumber, hours, employeeNumber;
		String outsourced, name;
		Double valuePerHour, additionalCharge;
		Employee employee;
		List<Employee> employees = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		/*Adicionando valor à variável employeesNumber*/
		System.out.print("Enter the number of employees: ");
		employeesNumber = sc.nextInt();
		
		/*For que vai de 0 até o número da variável employeesNumber.*/
		for(employeeNumber = 0; employeeNumber < employeesNumber; employeeNumber++) {
			System.out.printf("Employee #%d data:%n", employeeNumber+1);
			
			/*Adicionando valor à variavel outsourced*/
			System.out.print("Outsourced (y/n)? ");
			sc.nextLine();
			outsourced = sc.nextLine();

			/*Adicionando valor à variável name*/
			System.out.print("Name: ");
			name = sc.nextLine();
			
			/*Adicionando valor à variável hours*/
			System.out.print("Hours: ");
			hours = sc.nextInt();
			
			/*Adicionando valor à variável valuePerHour*/
			System.out.print("Value per hour: ");
			valuePerHour = sc.nextDouble();
			
			/*If caso o valor da variável oursourced seja igual a "y" ele cria um objeto "OutsourcedEmployee" para a variável "employee", caso seja outra coisa
			 * a variável "employee" recebe um objeto "Employee"*/
			if (outsourced.equals("y")) {
				System.out.print("Additional charge: ");
				additionalCharge = sc.nextDouble();
				
				employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
			}
			else {
				employee = new Employee(name,hours, valuePerHour);
			}
			
			/*Adicionando a variável "employee" à lista "employees"*/
			employees.add(employee);
				
		}
		
		/*For para cada employee dentro da lista employees, mostra o nome e o valor total do pagamento do employee.*/
		System.out.println("PAYMENTS: ");
		for(Employee e: employees) {
			System.out.printf("%s - $ %.2f%n", e.getName(), e.payment());
		}
		
		sc.close();
	}

}
