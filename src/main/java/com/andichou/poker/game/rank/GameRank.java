package com.andichou.poker.game.rank;

import com.andichou.poker.card.Card;
import com.andichou.poker.common.constants.GeneralConstant;
import com.andichou.poker.helper.GameRankFormatter;

public abstract class GameRank implements Comparable<GameRank> {

    private final Card card;

    private final int order;

    public GameRank(Card card, int order) {
        this.card = card;
        this.order = order;
    }

    public static GameRank highest(Card card) {
        return new HighestRank(card, GeneralConstant.HIGHEST);
    }

    public static GameRank onePair(Card first, Card second, Card card) {
        return new OnePairRank(first, second, card, GeneralConstant.ONE_PAIR);
    }

    public static GameRank twoPair(Card.Rank firstRank, Card.Rank secondRank) {
        return new TwoPairRank(firstRank, secondRank, GeneralConstant.TWO_PAIR);
    }

    public static GameRank threePair(Card.Rank rank) {
        return new ThreePairRank(rank, GeneralConstant.THREE_PAIR);
    }

    public static GameRank fourPair(Card.Rank rank) {
        return new FourPairRank(rank, GeneralConstant.FOUR_PAIR);
    }

    public static GameRank flush(Card card) {
        return new FlushRank(card, GeneralConstant.FLUSH);
    }

    public static GameRank straight(Card card) {
        return new StraightRank(card, GeneralConstant.STRAIGHT);
    }

    public static GameRank straightFlush(Card card) {
        return new StraightFlushRank(card, GeneralConstant.STRAIGHT_FLUSH);
    }

    public static GameRank fullHouse(Card card) {
        return new FullHouseRank(card, GeneralConstant.FULL_HOUSE);
    }

    public static GameRank royalFlush(Card card) {
        return new RoyalFlushRank(card, GeneralConstant.ROYAL_FLUSH);
    }

    public boolean isHigher(GameRank rank) {
        if (order == rank.order) {
            if (card.suit != rank.card.suit) {
                return card.isHigher(rank.card.suit);
            }
            return card.isHigher(rank.card);
        }

        return order > rank.order;
    }

    public abstract <T> T message(GameRankFormatter<T> formatter);

    @Override
    public int compareTo(GameRank gameRank) {
        return Integer.compare(order, gameRank.order);
    }
}
