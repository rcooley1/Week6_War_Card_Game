package warCardGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private List<Card> hand = new ArrayList<Card>();
	private int score = 0;
	private String name = "";
	
	public void describeHand(Player player, List<Card> cards) {
		System.out.println(player.getName() + " has drawn: ");
		cards.get(0).describe();
		}
	
	
	public Card flip(List<Card> hand) {
		Card card = hand.remove(0);
		return card;
	}
	
	public void draw(Deck deck) {
		Card card = deck.draw();
		hand.add(card);
	}
	
	public void incrementScore() {
		score++;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	public List<Card> getHand() {
		return hand;
	}

}
