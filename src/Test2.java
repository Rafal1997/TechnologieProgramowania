import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class Test2 {
	
	Deck deck1, deck2, deck3, deck4, deck5, deck6;
	
	@Before
	public void setUp() {
		deck1 = new Deck(52);
		deck2 = new Deck(52);
		deck3 = new Deck(52);
		for (int j=0; j<52; j++) {
			deck2.card[j]=deck1.card[j];
		}
		deck4 = new Deck(32);
		deck5 = new Deck(24);
	}
	
	@Test (timeout=1000)
	public void testCheck(){
		for (int i=0; i<52; i++) {
			assertEquals(deck1.card[i],deck2.card[i]);
		}
	}
	
	@Test
	public void testQuantity(){
		assertTrue(deck1.card.length==52);
		assertTrue(deck4.card.length==32);
		assertTrue(deck5.card.length==24);
	}
	
	@Test
	public void testAtTheBeginning(){
		assertEquals(deck1.card[15], deck3.card[15]);
	}
	
	@Ignore("Not ready yet") 
	public void testAfterShuffle1(){
		deck1.shuffleCards();
		assertNotSame(deck1,deck2);
	}
	
	@Test
	public void testCompering() {
		
		deck1.shuffleCards2();
		assertNotSame(deck1.card.length,deck4.card.length);
	}
	
	@Test
	public void testSequenceAfterSchuffle1() {
		assertEquals(deck1.card.length,52);
		assertNotSame(deck1.card[12],deck3.card[12]);
	}
	
	@Test
	public void testSort() {
		deck1.shuffleCards();
		assertNotSame(deck1.card[21],deck2.card[21]);
		deck1.cardSort();
		assertEquals(deck1.card.length,52);
		assertSame(deck1.card[21],deck2.card[21]);
		
	}
	
	@Test
	public void testAfterSchuffle2() {
		//deck3 = deck1;
		deck1.shuffleCards2();
		assertNotSame(deck1.card[15],deck3.card[15]);
		assertEquals(deck1.card.length, 52);
		//System.out.println(deck3.card[15].toString());
		//System.out.println(deck1.card[15].toString());
	}
	
	@Test
	public void testFirstCard() {
		
		assertNotNull(deck1.firstCardReturn());
		assertNotNull(deck2.firstCardReturn());
		assertNotNull(deck3.firstCardReturn());
		assertNotNull(deck4.firstCardReturn());
		assertNotNull(deck5.firstCardReturn());
	}
	
	@Test
	public void testNull1() {
		assertNull(deck6);
	}
	
	@Test (expected=NullPointerException.class)
	public void testNull2() {
		deck6.shuffleCards();
		assertSame(deck6.card[11],deck4.card[11]);
		
		
	}
	
	@After
	public void tearDown() {
		deck1 = null;
		deck2 = null;
		deck3 = null;
		deck4 = null;
		deck5 = null;
	}

}
