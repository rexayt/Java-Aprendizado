package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	
	public Product(String name, double price, int quantity) {
		
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double totalProduto() {
		
		return (double)(this.quantity * this.price);
	}
	
	public String toString() {
		
		return String.format("%s, $%.2f, Quantity: %d, Subtotal: $%.2f", this.name, this.price, this.quantity, this.totalProduto());
	}
}
