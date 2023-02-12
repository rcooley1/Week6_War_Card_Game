package warCardGame;

public class Card {
	/*
	 * Card
Fields
value (contains a value from 2-14 representing cards 2-Ace)
name (e.g. Ace of Diamonds, or Two of Hearts)
Methods
Getters and Setters
describe (prints out information about a card)
	 */
	private int value;
	private String name;
	private String rank;
	
	
	public Card(int value, String name, String rank) {
		this.value = value;
		this.name = name;
		this.rank = rank;
	}
		
	public void describe() {
		System.out.println(rank + " of " + name);
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
}
