package com.andichou.poker.card;

public class Card implements Comparable<Card> {

    public enum Suit {
        SPADES, HEARTS, CLUBS, DIAMONDS
    }

    public enum Rank {
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11),
        QUEEN(12),
        KING(13),
        ACE(14);

        public final Integer value;

        Rank(int value) {
            this.value = value;
        }
    }

    public final Rank rank;
    public final Suit suit;

    public Card(Rank rank,
                Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public int compareTo(Card card) {
        return rank.value.compareTo(card.rank.value);
    }

    @Override
    public String toString() {
        return rank + "" + suit;
    }
}
