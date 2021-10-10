package com.andichou.poker.card;

import java.util.Objects;

public class Card implements Comparable<Card> {

    public enum Suit {
        SPADES(4),
        HEARTS(3),
        CLUBS(2),
        DIAMONDS(1);

        public final int value;

        Suit(int value) {
            this.value = value;
        }
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

        public static Rank min(Rank first, Rank second) {
            return first.value < second.value ? first : second;
        }

        public static Rank max(Rank first, Rank second) {
            return first.value < second.value ? second : first;
        }

        public boolean isAce(Rank rank) {
            return rank.value.compareTo(ACE.value) == 0;
        }

        public boolean isSequence(Rank rank) {
            return rank.value - 1 == value;
        }
    }

    public final Rank rank;
    public final Suit suit;

    public Card(Rank rank,
                Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public boolean isSequence(Card card) {
        return rank.isSequence(card.rank);
    }

    public boolean isHigher(Card card) {
        return rank.value > card.rank.value;
    }

    public boolean isHigher(Suit playerSuit) {
        return suit.value > playerSuit.value;
    }

    @Override
    public int compareTo(Card card) {
        return rank.value.compareTo(card.rank.value);
    }

    @Override
    public String toString() {
        return rank.value + "" + suit.value;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Card)) return false;
        Card card = (Card) object;
        return rank == card.rank &&
            suit == card.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }
}
