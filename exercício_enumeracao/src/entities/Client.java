package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Client {
	private String name;
	private String email;
	private LocalDate birthDate;
	private List<Order> orders = new ArrayList<>();
	private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Client(String name, String email, LocalDate birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}
	
	public void addOrder(Order order) {
		this.orders.add(order);
	}
	
	public void showOrder() {
		if (this.orders.size() > 0) {
			for (Order order : this.orders) {
				System.out.println("ORDER SUMMARY");
				System.out.printf("Order moment: %s%n", order.getOrderTime());
				System.out.printf("Order status %s%n", order.getStatus());
				System.out.printf("Client: %s (%s) - %s%n",this.name, this.fmt.format(this.birthDate), this.email);
				System.out.println("Order items: ");
				for (Product p: order.getProducts()) {
					System.out.println(p.toString());
				}
				System.out.println(order.showTotal());
				
			}
		}
		else {
			System.out.println("This client has no orders");
		}
	}
}
