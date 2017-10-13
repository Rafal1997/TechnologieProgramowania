
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card firstCard = new Card(Card.Color.DIAMONDS, Card.Value52.SEVEN);
		Card secondCard = new Card(Card.Color.DIAMONDS, Card.Value32.SEVEN);
		Card thirdCard = new Card(Card.Color.HEARTS, Card.Value24.TEN);
		
		System.out.println(firstCard.equals(secondCard));
		System.out.println(thirdCard.equals(secondCard));
		System.out.println("Conflict 1");
	}

}
