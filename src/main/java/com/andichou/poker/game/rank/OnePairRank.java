package com.andichou.poker.game.rank;

import com.andichou.poker.card.Card;
import com.andichou.poker.helper.GameRankFormatter;

public class OnePairRank extends GameRank {

    private final Card first;

    private final Card second;

    private final Card card;

    public OnePairRank(Card first,
                       Card second,
                       Card card,
                       int order) {
        super(first, order);
        this.first = first;
        this.second = second;
        this.card = card;
    }

    public Card getCard() {
        return first;
    }

    @Override
    public <T> T message(GameRankFormatter<T> formatter) {
        return formatter.message(this);
    }
}
