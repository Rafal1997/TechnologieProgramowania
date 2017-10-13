
public class Deck {

	Card firstCard;
	Card[] card;
	Card[] card2;
	Card[] card3;
	Card[] card4;
	
	Deck(int size) {
		if (size == 52) {
			card = new Card[size];
			card2 = new Card[size];
			card3 = new Card[size];
			int i = 0;
			
			for (Card.Color color: Card.Color.values()) {
				for (Card.Value52 value: Card.Value52.values()) {
					card[i] = new Card(color, value);
					card3[i] = new Card(color, value);
					card3[i] = card[i];
					i++;
				}
			}
		}
		
		else if (size == 32) {
			card = new Card[size];
			card2 = new Card[size];
			card3 = new Card[size];
			int i = 0;
			
			for (Card.Color color: Card.Color.values()) {
				for (Card.Value32 value: Card.Value32.values()) {
					card[i] = new Card(color, value);
					card3[i] = new Card(color, value);
					card3[i] = card[i];
					
					i++;
				}
			}
		}
		
		else if (size == 24) {
			card = new Card[size];
			card2 = new Card[size];
			card3 = new Card[size];
			int i = 0;
			
			for (Card.Color color: Card.Color.values()) {
				for (Card.Value24 value: Card.Value24.values()) {
					card[i] = new Card(color, value);
					card3[i] = new Card(color, value);
					card3[i] = card[i];
					
					i++;
				}
			}
		}
		
	}
	/*
	void testPrintCards() {
		for (int i=0; i<card.length; i++) {
			System.out.println(card[i]);
		}
	}
	*/
	void shuffleCards() {
		//biorę tablicę card
		//nastepnie przestawiam karty
		//nastepnie zwracam
		for (int i=0; i<((card.length)/2); i++) {
			card2[2*i] = card[i];
			card2[2*i+1] = card[(int)(i+((card.length)/2))];
		}
		card = card2;
	}
	
	void shuffleCards2() {
		for (int i=0; i<(card.length)/2; i++) {
			card2[2*i] = card[card.length-1-i];
			card2[2*i+1] = card[(int)(((card.length)/2)-i)];
		}
		card = card2;
	}
	
	void cardSort() {
		for (int i=0; i<card.length; i++) {
			card[i]=card3[i];
		}
	}
	
	Card firstCardReturn() {
		firstCard = card[0];
		System.out.println("The color of the first card is: "+
		firstCard.color.toString()+
		" and the value is: "+firstCard.value.toString());
		return firstCard;
	}
}
