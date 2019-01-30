package edu.gcu.cst105.week3.wednesday;

public class Circle extends Shape {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// Constructors
	public Circle() {
		System.out.println("Making a 0 parameter circle.");
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle(double radius, String color, boolean filled) {
		super.setColor(color);
		super.setFilled(filled);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		double area = this.radius * this.radius * 3.14;
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter = this.radius * 2 * 3.14;
		return perimeter;
	}
	
	public String toString() {
		String hold;
		hold = "Color: " + super.getColor() + "\n";
		hold += "Filled: " + super.isFilled() + "\n";
		hold += "Radius: " + this.getRadius() + "\n";
		return hold;
	}
}
