package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private List<Product> products = new ArrayList<>();
	private LocalDateTime orderTime = LocalDateTime.now();
	private OrderStatus status;
	
	public Order(List<Product> products, OrderStatus status) {
		this.status = status;
		addProducts(products);
		
	}
	
	public List<Product> getProducts(){
		return this.products;
	}
	
	public void addProducts(List<Product> products) {
		for (Product p : products) {
			this.products.add(p);
		}
	}
	
	public void setStatus(OrderStatus status) {
		this.status	= status; 
	}
	
	public OrderStatus getStatus() {
		return this.status;
	}
	
	public LocalDateTime getOrderTime() {
		return this.orderTime;
	}
	
	
	public void addProduct(Product product) {
		this.products.add(product);
	}
	
	public String showTotal() {
		double total = 0;
		for (Product p: this.products) {
			total += p.totalProduto();
		}
		return String.format("Total price: %.2f%n", total);
	}
}
