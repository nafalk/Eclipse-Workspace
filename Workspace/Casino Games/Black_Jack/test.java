package Black_Jack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import Black_Jack.Card;
import Black_Jack.Deck;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int Add_Players_Hand (Deck deck, ArrayList <Card> Players_Hand, int PlayersTotal){
		
		
		Players_Hand.add(deck.deck.get(0));

		PlayersTotal = PlayersTotal + (deck.deck.get(0).rank);
		deck.deck.remove(0);
		return PlayersTotal;
	}
	public static void printplayer(ArrayList<Card> PlayersHand){
		int PlayersTotal = 0;
		PlayersTotal = Add_Players_Hand( null, PlayersHand, PlayersTotal);
		
		System.out.println("Your hand consists of:\n");
		
		// Print names
			for (int i=0; i<PlayersHand.size(); i++) {
				System.out.println(PlayersHand.get(i).value + PlayersHand.get(i).suit );
			}
		System.out.println("\nYour total is " + PlayersTotal);
	}
	public static void printtotal(int playerstotal){


		System.out.print(playerstotal);
	}

}
