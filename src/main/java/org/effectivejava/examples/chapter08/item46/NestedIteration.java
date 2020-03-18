// Can you spot the bug? - Page 46
package org.effectivejava.examples.chapter08.item46;

import java.util.*;

enum Suit {
	CLUB, DIAMOND, HEART, SPADE
}

enum Rank {
	ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
}

class Card {
	final Suit suit;
	final Rank rank;

	Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}
}

public class NestedIteration {
	public static void main(String[] args) {
		Collection<Suit> suits = Arrays.asList(Suit.values());
		Collection<Rank> ranks = Arrays.asList(Rank.values());

		List<Card> deck = new ArrayList<Card>();
		/*for (Iterator<Suit> i = suits.iterator(); i.hasNext();)
			for (Iterator<Rank> j = ranks.iterator(); j.hasNext();)
				deck.add(new Card(i.next(), j.next()));*/

		/*for (Iterator<Rank> i=ranks.iterator();i.hasNext();){
			for(Iterator<Suit> j=suits.iterator();j.hasNext();){
				deck.add(new Card(j.next(), i.next()));
			}
		}*/

		for (Iterator<Suit> i = suits.iterator(); i.hasNext();) {
			Suit suit = i.next();
			for (Iterator<Rank> j = ranks.iterator(); j.hasNext(); ) {
				deck.add(new Card(suit, j.next()));
			}
		}

		System.out.println(deck);
		// Preferred idiom for nested iteration on collections and arrays
		// for (Suit suit : suits)
		// for (Rank rank : ranks)
		// deck.add(new Card(suit, rank));
	}
}