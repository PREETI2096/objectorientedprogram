package com.bridgelabz.cards;

 enum Suit{
	SPADES,DIAMONDS,CLUBS,HEARTS;
}

public class Cards {
	private Suit suit;
	private String value;
	public Cards(Suit suit, String value) {
		this.suit = suit;
		this.value = value;
	}
	public Suit getSuit() {
		return suit;
	}
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
			
	}
