package com.andichou.poker.card;

import com.andichou.poker.card.Card;

public class FourCard {

    private final Card first;

    private final Card second;

    private final Card third;

    private final Card fourth;

    public FourCard(Card first, Card second, Card third, Card fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    public Card getFirst() {
        return first;
    }
}
