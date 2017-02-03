package Black_Jack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import Black_Jack.Card;
import Black_Jack.Deck;

public class Black_Jack {

	static Deck deck = new Deck();
	// Make Player Hand
	static ArrayList <Card> Players_Hand = new ArrayList <Card> ();
	// Make Dealer Hand
	static ArrayList <Card> Dealers_Hand = new ArrayList <Card> ();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String response = null;

		// Start
		System.out.println("You are now playing BlackJack the goal is to get closest to 21 without going over. \nAces are worth 1 or 11 and face cards are worth 10 all others are the number value as jokers are not used in Black Jack\n");
		// add cards to hands

		Add_Players_Hand(deck,Players_Hand, 0);
		Add_Dealers_Hand(deck,Dealers_Hand, 0);
		Add_Players_Hand(deck,Players_Hand, 0);
		Add_Dealers_Hand(deck,Dealers_Hand, 0);

		// Print player hand
		System.out.println("Your hand consists of:\n");
		printHand(Players_Hand);

		Playerturn(deck,Players_Hand);
	}


	public static void Playerturn(Deck deck, ArrayList <Card> Players_Hand){
		Scanner input = new Scanner(System.in);
		String response = null;
		boolean isHit = true;
		int PlayersTotal = handTotal(Players_Hand);

		System.out.println("\nPlayersTotal = " + PlayersTotal);

		//Player game play
		while (PlayersTotal < 21 && isHit){
			PlayersTotal = handTotal(Players_Hand);

			System.out.println("\nHit or Stay ");

			response =input.next();

			if (response.equalsIgnoreCase ("Hit")){
				Add_Players_Hand(deck,Players_Hand, PlayersTotal);

				System.out.println("\nYour hand consists of: \n");
				printHand(Players_Hand);
				PlayersTotal = handTotal(Players_Hand);

				System.out.println("\nPlayersTotal = " + PlayersTotal);
			}

			else if (response.equalsIgnoreCase ("Stay")){
				isHit = false;
				Dealerturn(deck, Dealers_Hand);
			}

			if (PlayersTotal >21){
				isHit = false;
				System.out.println("You Bust");
			}
			
		}	
		System.out.println("call dealler turn");
		Dealerturn(deck, Dealers_Hand);
	}
	public static void Dealerturn(Deck deck, ArrayList <Card> Dealers_Hand){
			boolean isHit = true;
		int DealersTotal = handTotal(Dealers_Hand);

			//Dealer game play
		
		while (DealersTotal < 21 && isHit){
			DealersTotal = handTotal(Dealers_Hand);

			
			if (DealersTotal<16){
				Add_Dealers_Hand(deck,Dealers_Hand, DealersTotal);

				System.out.println("\nDealers hand consists of: \n");
				printHand(Dealers_Hand);
				DealersTotal = handTotal(Dealers_Hand);

				System.out.println("\nDealersTotal = " + DealersTotal);
			}

			else if (DealersTotal == 21){
				System.out.println("Dealer Has 21");

			}
			else if (DealersTotal >21){
				System.out.println("Dealer Bust");
			}
		}	
		}
	
	/*public static void Dealerturn(Deck deck, ArrayList <Card> Dealers_Hand){

		int DealersTotal = handTotal(Dealers_Hand);

		System.out.println("\nDeallers hand");
		printHand(Dealers_Hand);
		//Dealer game play
		while (DealersTotal < 21 ){
			DealersTotal = handTotal(Dealers_Hand);


			if (DealersTotal<16){
				Add_Dealers_Hand(deck,Dealers_Hand, DealersTotal);

				DealersTotal = handTotal(Players_Hand);
			}
			else if (DealersTotal == 21){
				System.out.println("Dealer Has 21");

			}
			else if (DealersTotal >21){
				System.out.println("Dealer Bust");
			}
		}


	}
*/
	//add methods

	public static int Add_Dealers_Hand(Deck deck, ArrayList <Card> Dealers_Hand, int DealersTotal){
		

		Dealers_Hand.add(deck.deck.get(0));
		DealersTotal = DealersTotal + (deck.deck.get(0).rank);
		deck.deck.remove(0);
		return DealersTotal;
	}

	public static int Add_Players_Hand (Deck deck, ArrayList <Card> Players_Hand, int PlayersTotal){


		Players_Hand.add(deck.deck.get(0));

		PlayersTotal = PlayersTotal + (deck.deck.get(0).rank);
		deck.deck.remove(0);

		return PlayersTotal;
	}

	public static int handTotal (ArrayList<Card> hand) {

		int total = 0;

		for (Card card : hand) {
			total = total + card.rank;
		}

		return total;

	}

	//print methods

	public static void printdeck(ArrayList<Card> deck){

		System.out.println("\nYour deck consists of:\n");

		for (int i=0; i<deck.size(); i++) {
			System.out.println(deck.get(i).value  + deck.get(i).suit);
		}
	}

	public static void printHand (ArrayList<Card> hand) {

		int total = 0;

		for (Card card : hand) {
			System.out.println(card.value + card.suit);
		}
	}

}