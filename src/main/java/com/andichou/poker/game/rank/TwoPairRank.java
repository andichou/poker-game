package com.andichou.poker.game.rank;

import com.andichou.poker.card.Card;
import com.andichou.poker.helper.GameRankFormatter;

public class TwoPairRank extends GameRank {

    private final Card.Rank firstRank;

    private final Card.Rank secondRank;

    public TwoPairRank(Card.Rank firstRank,
                       Card.Rank secondRank,
                       int order) {
        super(new Card(Card.Rank.max(firstRank, secondRank), null), order);
        this.firstRank = firstRank;
        this.secondRank = secondRank;
    }

    public Card.Rank highestRank() {
        return Card.Rank.max(firstRank, secondRank);
    }

    public Card.Rank lowestRank() {
        return Card.Rank.min(firstRank, secondRank);
    }

    @Override
    public <T> T message(GameRankFormatter<T> formatter) {
        return formatter.message(this);
    }
}
