package edu.gcu.cst105.week3.tuesday;

import java.util.Random;
import java.util.Scanner;

public class Arena {
	// Class / instance attributes = globally accessible
	Hero getterman = new Hero();
	Villian setterman = new Villian();
	Scanner sc = new Scanner(System.in);

	// Can not access non-static attributes from a static method
	public static void main(String[] args) {
		Arena talkingStick = new Arena();
		talkingStick.nameCharacters();
		talkingStick.talkCharacters();
		talkingStick.doBattle(talkingStick);
	}

	private void doBattle(Arena talkingStick) {
		int round = 1;
		while (getterman.getHealth() > 0 && setterman.getHealth() > 0) {
			System.out.println("== ROUND " + round++ + "==");
			talkingStick.getCharacterAction();
			talkingStick.calculateHealth();
		}
		System.out.println("There is a winner!");
	}

	private void calculateHealth() {
		int damage;
		if (getterman.getAction() == 'F')
		{
			damage = rand_generator(10);
			System.out.print(setterman.getName() + " receives damage of " + damage);
			System.out.print(" from " + getterman.moves[rand_generator(4)]);
			System.out.println(" from " + getterman.getName());
			setterman.setHealth(setterman.getHealth() - damage);
			setterman.displayHealth();
		}
		else {
			damage = rand_generator(5);
			System.out.println(getterman.getName() + " receives healing for " + damage);
			getterman.setHealth(getterman.getHealth() + damage);
			getterman.displayHealth();			
		}
		if (setterman.getAction() == 'F')
		{
			damage = rand_generator(10);
			System.out.print(getterman.getName() + " receives damage of " + damage);
			System.out.print(" from " + setterman.moves[rand_generator(4)]);
			System.out.println(" from " + setterman.getName());
			getterman.setHealth(getterman.getHealth() - damage);
			getterman.displayHealth();
		}
		else {
			damage = rand_generator(5);
			System.out.println(setterman.getName() + " receives healing for " + damage);
			setterman.setHealth(setterman.getHealth() + damage);
			setterman.displayHealth();			
		}		
	}
	
	private int rand_generator(int threshold) {
		Random rand = new Random();
		return rand.nextInt(threshold);
	}

	private void nameCharacters() {
		getterman.setName("Thor");
		setterman.setName("Loki");
		getterman.setHealth(rand_generator(100)+25);
		setterman.setHealth(rand_generator(100)+25);
		getterman.moves[0] = "Lightning Strike";
		getterman.moves[1] = "Thunder Clap";
		getterman.moves[2] = "Hammer Throw";
		getterman.moves[3] = "Kiss";		
		setterman.moves[0] = "Confuse";
		setterman.moves[1] = "Stealth Attack";
		setterman.moves[2] = "Cutting Remark";
		setterman.moves[3] = "Lacerate";
		setterman.displayHealth();
		getterman.displayHealth();
	}
	
	private void talkCharacters() {
		getterman.talk("By the power of Asgaard!");
		setterman.talk("Talking trash!");		
	}
	
	private void getCharacterAction() {
		// Get the action for getterman
		System.out.println("What should " + getterman.getName() + " do?");
		System.out.println("F = Fight : H = Heal");
		// Take the input as a String and convert to a char
		getterman.setAction(sc.nextLine().toUpperCase().charAt(0));	
		
		// Get the action for setterman	
		System.out.println("What should " + setterman.getName() + " do?");
		System.out.println("F = Fight : H = Heal");
		// Take the input as a String and convert to a char		
		setterman.setAction(sc.nextLine().toUpperCase().charAt(0));
	}
}
