package edu.gcu.cst105.week3.wednesday;

public abstract class Shape {

		private String color;
		private boolean filled;
		
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public boolean isFilled() {
			return filled;
		}
		public void setFilled(boolean filled) {
			this.filled = filled;
		}
		
		
		// Constructors
		public Shape() {
			System.out.println("Making a 0 parameter shape.");			
		}
		// Overloaded constructor
		public Shape(String color, boolean filled) {
			this.color = color;
			this.filled = filled;
			System.out.println("Making a 2 parameter shape.");				
		}
		
		// Abstract methods
		public abstract double getArea();
		public abstract double getPerimeter();
		
		// Concrete method
		public String toString() {
			return "A";	
		}
		
		
		
		
		
}
