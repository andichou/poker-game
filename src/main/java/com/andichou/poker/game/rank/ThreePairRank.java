package com.andichou.poker.game.rank;

import com.andichou.poker.card.Card;
import com.andichou.poker.helper.GameRankFormatter;

public class ThreePairRank extends GameRank {

    private final Card.Rank rank;

    public ThreePairRank(Card.Rank rank,
                         int order) {
        super(new Card(rank, null), order);
        this.rank = rank;
    }

    public Card.Rank getRank() {
        return rank;
    }

    @Override
    public <T> T message(GameRankFormatter<T> formatter) {
        return formatter.message(this);
    }
}
