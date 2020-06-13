package edu.gcu.cst105.week3.monday;

public class Person {

	public static void main(String[] args) {
		// Can not make object of abstract classes
		// Fruit banana = new Fruit();
		
		Apple redDelicious = new Apple();
		redDelicious.setColor("red");
		redDelicious.setSweet(true);
		redDelicious.rot(100);
		System.out.println(redDelicious.toString());

		Fruit redApple = new Apple();
		redDelicious.setColor("red");
		redDelicious.setSweet(true);
		redDelicious.rot(100);
		System.out.println(redDelicious.toString());
		
	}
	

}
