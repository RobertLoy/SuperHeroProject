package edu.gcu.cst105.week3.monday;

public abstract class Fruit {
	// Class or instance attributes
	private boolean isSweet;

	// Getter and Setter for Data hiding
	// Encapsulation pieces
	public boolean isSweet() {
		return isSweet;
	}

	public void setSweet(boolean isSweet) {
		this.isSweet = isSweet;
	}
	
	// Do not define the method body for abstract methods
	// The whole class needs to be abstract 
	// because of this method being abstract
	public abstract void rot(int days);
	
	public String toString() {
		return "The fruit is sweet: " +  this.isSweet();
	}
	
}
