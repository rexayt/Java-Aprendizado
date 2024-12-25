package entities;

public class ImportedProduct extends Product{
	private Double customsFee;
	
	public ImportedProduct(){	
		super();
	}
	
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public String priceTag() {
		return String.format("%s $ %.2f (Customs fee: $ %.2f)", this.name, this.totalPrice(), this.customsFee);
	}
	
	public Double totalPrice() {
		return this.price + this.customsFee;
	}
}
