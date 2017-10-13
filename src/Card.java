public class Card {

	public enum Color implements IColor {
		CLUBS, DIAMONDS, HEARTS, SPADES;
	}
	
	public enum Value52 implements IValue {
		TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN,
		JACK, QUEEN, KING, ACE;
	}
	
	public enum Value32 implements IValue {
		SEVEN, EIGHT, NINE, TEN,
		JACK, QUEEN, KING, ACE;
	}
	
	public enum Value24 implements IValue {
		NINE, TEN, JACK, QUEEN, KING, ACE;
	}
	
	public final IColor color;
	public final IValue value;
	
	Card(IColor color, IValue value) {
		this.color = color;
		this.value = value;
	}
	
	public String toString() {
		return "My color is: "+color.toString()+
				" and my value is: "+value.toString();
		
	}
	
	@Override
	public boolean equals(Object object) {
		return object instanceof Card && color.toString().equals(((Card)object).color.toString()) &&
				value.toString().equals(((Card)object).value.toString());
	}
	
}
