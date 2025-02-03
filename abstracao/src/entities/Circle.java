package entities;

public class Circle extends Shape{

	private Double radius;
	
	public Circle() {
		super();
	}
	
	
	
	public Circle(Double radius) {
		super();
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public Double area() {

		return Math.PI * radius * radius;
	}
	
}
