
import static org.junit.Assert.*;


import junit.framework.TestCase;

public class Test1 extends TestCase{
	
	
	


		Card card1, card2, card3;
		
		public void setUp() {
			card1 = new Card(Card.Color.CLUBS, Card.Value52.NINE);
			card3 = new Card(Card.Color.CLUBS, Card.Value52.NINE);
		}
		
		public void testTrue() {
			assertTrue(card1.color==Card.Color.CLUBS);
		}
		
		public void testNull() {
			assertNull(card2);
		}
		
		
		public void testNotNull() {
			assertNotNull(card1);
		}
		
		public void testCorrectValue() {
			assertSame(card1.color,card3.color);
		}
		
		public void testMessage() {
			String message = "You did not choose a card CLUBS NINE.";
			String expected = card1.toString();
			String actual = "My color is: CLUBS and my value is: NINE";
			
			assertEquals(message, expected, actual);
		}
		
		public void testEquals() {
			card2 = new Card (Card.Color.CLUBS, Card.Value24.NINE);
			
			assertEquals(card1, card2);
		}
		
		public void tearDown() {
			card1 = null;
			card2 = null;
			card3 = null;
		}
		

}
