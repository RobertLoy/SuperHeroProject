package edu.gcu.cst105.week3.tuesday;

public class Villian extends Character implements Moves {

	private String motive = "World domination!";
	
	public String getMotive() {
		return motive;
	}

	public void setMotive(String motive) {
		this.motive = motive;
	}
	
	// Have to implement because Moves interface says so
	public int fight(String move) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	// Have to implement because Moves interface says so
	public int heal(String move) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void talk(String catchPhrase) {
		System.out.print(this.getName() + " says, \"");
		System.out.print(catchPhrase);
		System.out.println("\", with a sneer.");
		
	}


}
