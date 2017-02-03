package Card_Deck;

import java.util.ArrayList;
import java.util.Collections;

public class Deck_No_Jokers {
	public static ArrayList <Card> deck = new ArrayList <Card> ();
	public Deck_No_Jokers() {

		// Make the deck of cards

		//Clubs

		deck.add(new Card(1,"Clubs","Ace of "));

		deck.add(new Card(2,"Clubs","2 of "));

		deck.add(new Card(3,"Clubs","3 of "));

		deck.add(new Card(4,"Clubs","4 of "));

		deck.add(new Card(5,"Clubs","5 of "));

		deck.add(new Card(6,"Clubs","6 of "));

		deck.add(new Card(7,"Clubs","7 of "));

		deck.add(new Card(8,"Clubs","8 of "));

		deck.add(new Card(9,"Clubs","9 of "));

		deck.add(new Card(10,"Clubs","10 of "));

		deck.add(new Card(10,"Clubs","King of "));

		deck.add(new Card(10,"Clubs","Quean of "));


		//Spades

		deck.add(new Card(1,"Spades","Ace of "));

		deck.add(new Card(2,"Spades", "2 of "));

		deck.add(new Card(3,"Spades","3 of "));

		deck.add(new Card(4,"Spades","4 of "));

		deck.add(new Card(5,"Spades","5 of "));

		deck.add(new Card(6,"Spades","6 of "));

		deck.add(new Card(7,"Spades","7 of "));

		deck.add(new Card(8,"Spades","8 of "));

		deck.add(new Card(9,"Spades","9 of "));

		deck.add(new Card(10,"Spades","10 of "));

		deck.add(new Card(10,"Spades","King of "));

		deck.add(new Card(10,"Spades","Quean of "));

		//Hearts

		deck.add(new Card(1,"Hearts","Ace of "));

		deck.add(new Card(2,"Hearts","2 of "));

		deck.add(new Card(3,"Hearts","3 of "));

		deck.add(new Card(4,"Hearts","4 of "));

		deck.add(new Card(5,"Hearts","5 of "));

		deck.add(new Card(6,"Hearts","6 of "));

		deck.add(new Card(7,"Hearts","7 of "));

		deck.add(new Card(8,"Hearts","8 of "));

		deck.add(new Card(9,"Hearts","9 of "));

		deck.add(new Card(10,"Hearts","10 of "));

		deck.add(new Card(10,"Hearts","King of "));

		deck.add(new Card(10,"Hearts","Quean of "));

		//Diamonds

		deck.add(new Card(1,"Diamonds","Ace of "));

		deck.add(new Card(2,"Diamonds","2 of "));

		deck.add(new Card(3,"Diamonds", "3 of "));

		deck.add(new Card(4,"Diamonds","4 of "));

		deck.add(new Card(5,"Diamonds","5 of "));

		deck.add(new Card(6,"Diamonds","6 of "));

		deck.add(new Card(7,"Diamonds","7 of "));

		deck.add(new Card(8,"Diamonds","8 of "));

		deck.add(new Card(9,"Diamonds","9 of "));

		deck.add(new Card(10,"Diamonds","10 of "));

		deck.add(new Card(10,"Diamonds","King of "));

		deck.add(new Card(10,"Diamonds","Quean of "));

	

		// Print the deck of cards

		/*for (Card card : deck) {

			System.out.print(card.facevalue + " " + card.suit + " " + card.rank + "\n");

		}
		 */	
		Collections.shuffle(deck);
		/*for (Card card : deck) {

			System.out.print(card.value + " " + card.suit + " " + card.rank + "\n");

		}
*/
	}
}