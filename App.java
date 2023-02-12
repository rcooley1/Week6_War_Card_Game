package warCardGame;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Deck deck1 = new Deck();
		deck1.shuffle();
		
		Player player1 = new Player();
		Player player2 = new Player();
		
		System.out.println("****************************");
		System.out.println("Welcome to my automated War card game.");
		System.out.println("Please enter a name for player 1: ");
		player1.setName(scanner.next());
		System.out.println("");
		System.out.println("Please enter a name for player 2: ");
		player2.setName(scanner.next());
		System.out.println("****************************");
		
		System.out.println("");
		System.out.println("");
		
		for(int i = 0; i < 26; i++) {
		player1.draw(deck1);
		player2.draw(deck1);
		}
		
		for(int i = 0; i < 26; i++) {
			System.out.println("Round " + (i + 1));
			player1.describeHand(player1, player1.getHand());
			player2.describeHand(player2, player2.getHand());
			if (player1.getHand().get(0).getValue() > player2.getHand().get(0).getValue()) {
				System.out.println(player1.getName() + " has won this round.");
				player1.incrementScore();
			} else if (player1.getHand().get(0).getValue() < player2.getHand().get(0).getValue()) {
				System.out.println(player2.getName() + " has won this round.");
				player2.incrementScore();
			}
			player1.flip(player1.getHand());
			player2.flip(player2.getHand());
			System.out.println(player1.getName() + "'s score is: " + player1.getScore());
			System.out.println(player2.getName() + "'s score is: " + player2.getScore());
			System.out.println("****************************");
		}
		
		if (player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() + " has won the game with a score of " + player1.getScore()+ "!");
		} else if(player2.getScore() > player1.getScore()) {
			System.out.println(player2.getName() + "has won the game with a score of " + player2.getScore() + "!");
		} else if (player2.getScore() == player1.getScore()) {
			System.out.println("This game has ended in a draw with a score of " + player1.getScore() + " for both players.");
		}
		
	}
}
