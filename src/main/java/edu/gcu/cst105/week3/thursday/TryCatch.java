package edu.gcu.cst105.week3.thursday;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] x = {5,7,3,5};
		
		try {
			System.out.println(x[6]);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());			
			System.out.println("Hey dummy!");
		}
		System.out.println("hello from the end!");
		
		int a = 7;
		int b = 0;
		
		try {
			System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Hee Hee Sucker!");
		}
	
	}

}
