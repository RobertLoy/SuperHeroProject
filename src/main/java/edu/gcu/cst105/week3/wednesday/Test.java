package edu.gcu.cst105.week3.wednesday;

public class Test {

	public static void main(String[] args) {
		// Shape s = new Shape();
		
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.setRadius(10);
		System.out.println(c.getArea());
		System.out.println(c.toString());
				
		Circle c2 = new Circle(12, "red", true);
		System.out.println(c2.getArea());		
		System.out.println(c2.toString());		

		Rectangle r1 = new Rectangle();
		r1.setHeight(10);
		r1.setWidth(20);
		System.out.println(r1.getArea());	
	}

}
