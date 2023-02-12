package warCardGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck{
/*
	 * Fields
cards (List of Card)
Methods
- shuffle (randomizes the order of the cards)
- draw (removes and returns the top card of the Cards field)
In the constructor, when a new Deck is instantiated, the Cards 
field should be populated with the standard 52 cards.
	 */
	public List<Card> cards = new ArrayList<Card>();
	
	String[] suits = {"Diamonds", "Hearts", "Spades", "Clubs"};
	//int[] values = {2,3,4,5,6,7,8,9,10,11,12,13,14};
	String[] ranks = {"2", "3","4","5", "6", "7", "8","9","10","Jack", "Queen", "King", "Ace"};
	
	//Deck constructor. The for loop ensures it will run until all ranks have been used.
	//The enhanced for loop ensures we will use all strings in the suits array.
	//2 is added to my index counter 'i' because that is what the deck will actually start with.
	//For each new card that is created, it will use the Card constructor and pass in the required values.
	//Value is not the number printed on the card, it is a int that will be used to determine the winner.
	
	public Deck(){
		for(int i = 0; i < ranks.length; i++) {
			for(String x : suits) {
				int value = i + 2;
				Card card = new Card(value, x, ranks[i]);
				cards.add(card);
		}
		}	
	
	}
	//method that first describes the card drawn, then removes the card from the deck.
	public Card draw() {
		Card card = this.cards.remove(0);
		
		return card;
	}
	
	//Method to shuffle the deck of cards.
	public void shuffle(){
		Collections.shuffle(cards);
	}
}
