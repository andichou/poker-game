package com.andichou.poker.card;

import com.andichou.poker.card.Card;

public class ThreeCard {

    private final Card first;

    private final Card second;

    private final Card third;

    public ThreeCard(Card first, Card second, Card third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public Card getFirst() {
        return first;
    }
}
