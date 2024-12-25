package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int id;
		String name;
		double salary, increase;
		boolean isTrue = false;
		
		List<Employee> employees = new ArrayList();
		
		System.out.printf("Quantos funcionários irão ser registrados: ");
		int n = sc.nextInt();
		
		for(int c = 0; c<n; c++) {
			System.out.printf("Employee %d%n: ", c+1);
			System.out.print("Id: ");
			id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.print("Salário: ");
			salary = sc.nextDouble();
			
			employees.add(new Employee(id, name, salary));
			System.out.println();
		}
		

		System.out.print("Digite o id do funcionário que terá um acréscimo de salário: ");
		id = sc.nextInt();
		
		for(Employee e: employees) {
			if (e.getId() == id) {
				System.out.println();
				System.out.print("Digite a porcentagem a ser acrescentada: ");
				increase = sc.nextDouble();
				e.increaseSalary(increase);
				isTrue = true;
				break;
			}
		}
		
		if (isTrue == false) {
			System.out.println();
			System.out.println("Este usuário não existe.");
		}
		
		showEmployees(employees);
		
		sc.close();
	}
	
	public static void showEmployees(List<Employee> employees) {
		for (Employee e : employees) {
			System.out.print(e.toString());
		}
	}

}
