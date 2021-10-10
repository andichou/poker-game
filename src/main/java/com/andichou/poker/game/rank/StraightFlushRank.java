package com.andichou.poker.game.rank;

import com.andichou.poker.card.Card;
import com.andichou.poker.helper.GameRankFormatter;

public class StraightFlushRank extends GameRank {

    private final Card card;

    public StraightFlushRank(Card card,
                             int order) {
        super(card, order);
        this.card = card;
    }

    public Card getCard() {
        return card;
    }

    @Override
    public <T> T message(GameRankFormatter<T> formatter) {
        return formatter.message(this);
    }
}
