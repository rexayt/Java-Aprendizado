package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line, path = "S:\\Documentos\\Cursos\\Java\\exercicio_stream\\in.txt";
		Double salary, sum = 0.0;
		List<Employee> users = new ArrayList<>();
		
		try(BufferedReader bf = new BufferedReader(new FileReader(path))){
			System.out.print("Enter salary: ");
			salary = sc.nextDouble();
			System.out.printf("Email of people whose salary is more than %.2f:%n", salary);
			
			while((line = bf.readLine()) != null) {
				String[] user = line.split(",");
				users.add(new Employee(user[0], user[1], Double.parseDouble(user[2])));
			}
			
			Stream<Employee> st1 = users.stream().filter(e -> e.getSalary() >= salary);
			st1.forEach(p -> System.out.println(p.getEmail()));
			
			
			
			
			System.out.printf("Sum of salary of people whose name starts with 'M': %.2f", sum);
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sc.close();
	}

}
