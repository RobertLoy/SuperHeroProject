package edu.gcu.cst105.week3.wednesday;

public class Rectangle extends Shape {
	private double width;
	private double height;

	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	// Constructors
	public Rectangle() {
		
	}
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;		
	}
	public Rectangle(double width, double height, String color, boolean filled) {
		super.setColor(color);
		super.setFilled(filled);
		this.width = width;
		this.height = height;	
	}

	@Override
	public double getArea() {
		double area = this.height * this.width;
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter = (this.height * 2) * (this.width * 2) ;
		return perimeter;
	}
	
	public String toString() {
		return "C";
	}
}
