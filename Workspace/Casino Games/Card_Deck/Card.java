package Card_Deck;

public class Card {
		public String suit, value;
		public int rank;

		public Card(){
		}

		public Card(int rank, String suit, String value) {

			this.suit = suit;

			this.rank = rank;

			this.value = value;
		}
	}