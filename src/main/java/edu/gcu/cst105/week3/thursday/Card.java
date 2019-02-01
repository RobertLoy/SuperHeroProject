package edu.gcu.cst105.week3.thursday;

public class Card {

	private String color;
	private String value;
	
	public String getColor() {
		return color;
	}

	public String getValue() {
		return value;
	}
	
	Card(String color, String value){
		this.color = color;
		this.value = value;
	}
	
	public String toString() {
		return this.color + " - " + this.value;
	}
	
}
