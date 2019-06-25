package com.biz.BlackJack.Mode;

public class DeckVO {


 private String suit;
 private  String denomination;
 private  int value;
 
 
public DeckVO() {
	super();
	// TODO Auto-generated constructor stub
}
public DeckVO(String suit, String denomination, int value) {
	super();
	this.suit = suit;
	this.denomination = denomination;
	this.value = value;
	
}
public String getSuit() {
	return suit;
}
public void setSuit(String suit) {
	this.suit = suit;
}
public String getDenomination() {
	return denomination;
}
public void setDenomination(String denomination) {
	this.denomination = denomination;
}
public int getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
}
@Override
public String toString() {
	return "DeckVO [suit=" + suit + ", denomination=" + denomination + ", value=" + value + "]";
}
 
 

}
