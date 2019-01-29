package edu.gcu.cst105.week3.monday;

public class Apple extends Fruit {

	private String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}	
	
	@Override
	public void rot(int days) {
		// If (days < 10) or (days < 30) or something else
		if(days < 10) {
			System.out.println("Good to eat!");
		}
		else if(days < 30) {
			System.out.println("Ugh this apple doesn't taste too great, I don't feel good");
		}
		else if(days < 60) {
			System.out.println("Looks like a black moon raisin!");
		}
		else {
			System.out.println("DO NOT EAT!");
		}
	}
	

}
