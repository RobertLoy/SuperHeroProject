package edu.gcu.cst105.week3.thursday;

import java.util.Random;
import java.util.Scanner;

public class Deal {

	public static Random r = new Random();
	public static Scanner s = new Scanner(System.in);		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] suit = {"C", "S", "H", "D"};
		String [] face = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		
		boolean flag = true;
		
		while (flag == true) {
			System.out.println("How many cards do you want?");
			int howManyCards = s.nextInt();
			int value =  0;
			for(int x = 0; x < howManyCards; x++) {
				int suitIndex = r.nextInt(4);
				int faceIndex = r.nextInt(13);
				System.out.println("Your card = " + suit[suitIndex] + " - " + face[faceIndex]);
				switch(face[faceIndex]) {
				case "2": value = value + 2;
					break;
				case "3": value = value + 3;
				break;
				case "4": value = value + 4;
				break;
				case "5": value = value + 5;
				break;
				case "6": value = value + 6;
				break;
				case "7": value = value + 7;
				break;
				case "8": value = value + 8;
				break;
				case "9": value = value + 9;
				break;
				case "A": value = value + 11;
				break;	
				default: value = value + 10;
				}
			
				if(value > 50) {
					System.out.println("Your total is " + value);
					System.out.println("You WON!");
					flag = false;
				}
				else{
					System.out.println("Your total is " + value);
					System.out.println("You need to TRY AGAIN!");
				}
			}
	
		}
		System.out.println("Game ended");			
		

	}

}
