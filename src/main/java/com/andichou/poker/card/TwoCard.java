package com.andichou.poker.card;

import com.andichou.poker.card.Card;

import java.util.Objects;

public class TwoCard {

    private final Card first;

    private final Card second;

    public TwoCard(Card first, Card second) {
        this.first = first;
        this.second = second;
    }

    public Card getFirst() {
        return first;
    }

    public Card getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        TwoCard twoCards = (TwoCard) object;
        return Objects.equals(first, twoCards.first) && Objects.equals(second, twoCards.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}
