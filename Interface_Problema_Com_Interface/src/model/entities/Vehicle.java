package model.entities;

public class Vehicle {
	
	private String model;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String model) {
		this.model = model;
	}
	
	public String getVehicle() {
		return this.model;
	}
	
	public void setVehicle(String model) {
		this.model = model;
	}
}
