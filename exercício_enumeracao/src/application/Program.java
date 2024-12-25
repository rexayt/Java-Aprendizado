package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {
	
	public static void main(String[] args) {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		String pName, name, email;
		double pPrice;
		LocalDate birthDate;
		Client client;
		OrderStatus status;
		List<Product> products = new ArrayList<>(); 
		int n, pQuantity;
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Email: ");
		email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		birthDate = LocalDate.parse(sc.nextLine(), fmt);
		client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		status = OrderStatus.valueOf(sc.nextLine());
		System.out.print("How many items to this order? ");
		n = sc.nextInt();
		for (int i = 0; i<n; i++) {
			System.out.printf("Enter #%d item data:%n", i+1);
			System.out.print("Product name: ");
			sc.nextLine();
			pName = sc.nextLine();
			System.out.print("Product price: ");
			pPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			pQuantity = sc.nextInt();
			products.add(new Product(pName, pPrice, pQuantity));
		}		
		client.addOrder(new Order(products, status));
		
		client.showOrder();

	}
	
}
