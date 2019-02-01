package edu.gcu.cst105.week3.thursday;

import java.util.Random;

public class Deck {
	
	public Card[] deck = new Card[108];
	int currentcard = 0;
	
	public Deck (Card [] cards) {
		this.deck = cards;
	}
	
	public void shuffle() {
		int index;
		Card temp;
		Random random = new Random();
		
		for(int x = 0; x < deck.length; x++) {
			index = random.nextInt(deck.length);
			temp = deck[index];
			deck[index] = deck[x];
			deck[x] = temp;
		}
	}
	
	public Card deal() {
		return deck[currentcard++];
	}

}
