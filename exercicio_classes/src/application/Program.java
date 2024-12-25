package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		
		String name, choice;
		Double customsFee, price;
		String manufactureDate;
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			System.out.printf("Product %d data:%n",i+1);
			System.out.print("Common, used or imported (c/u/i)? ");
			sc.nextLine();
			choice = sc.nextLine();
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Price: ");
			price = sc.nextDouble();
			if (choice.equals("u")) {
				System.out.print("Manufacture date (DD/MM/YY): ");
				sc.nextLine();
				manufactureDate = sc.nextLine();
				
				list.add(new UsedProduct(name, price, LocalDate.parse(manufactureDate, sdf)));
			}
			else if(choice.equals("i")) {
				System.out.print("Customs fee: ");
				customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));	
			}
			else if(choice.equals("c")) {
				list.add(new Product(name, price));
			}
		}
		
		for(Product p: list) {
			System.out.println(p.priceTag());
		}
		
		sc.close();
	}

}
