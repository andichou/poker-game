package com.andichou.poker.helper;

import com.andichou.poker.card.Card;
import com.andichou.poker.game.rank.FlushRank;
import com.andichou.poker.game.rank.FourPairRank;
import com.andichou.poker.game.rank.FullHouseRank;
import com.andichou.poker.game.rank.HighestRank;
import com.andichou.poker.game.rank.OnePairRank;
import com.andichou.poker.game.rank.RoyalFlushRank;
import com.andichou.poker.game.rank.StraightFlushRank;
import com.andichou.poker.game.rank.StraightRank;
import com.andichou.poker.game.rank.ThreePairRank;
import com.andichou.poker.game.rank.TwoPairRank;

public class Formatter implements GameRankFormatter<String> {

    @Override
    public String message(HighestRank entity) {
        return String.format("Highest card - %s", getRank(entity.getCard().rank));
    }

    @Override
    public String message(OnePairRank entity) {
        return String.format("One Pair - %s", getRank(entity.getCard().rank));
    }

    @Override
    public String message(TwoPairRank entity) {
        return String.format("Two Pair - %s and %s", getRank(entity.highestRank()), getRank(entity.lowestRank()));
    }

    @Override
    public String message(ThreePairRank entity) {
        return String.format("Three Pair - %s", getRank(entity.getRank()));
    }

    @Override
    public String message(FourPairRank entity) {
        return String.format("Four Pair - %s", getRank(entity.getRank()));
    }

    @Override
    public String message(StraightRank entity) {
        return String.format("Straight - %s", getRank(entity.getCard().rank));
    }

    @Override
    public String message(FlushRank entity) {
        return String.format("Flush - %s", getRank(entity.getCard().rank));
    }

    @Override
    public String message(StraightFlushRank entity) {
        return String.format("Straight Flush - %s", getRank(entity.getCard().rank));
    }

    @Override
    public String message(FullHouseRank entity) {
        return String.format("Full House - %s", getRank(entity.getCard().rank));
    }

    @Override
    public String message(RoyalFlushRank entity) {
        return String.format("Royal Flush - %s", getRank(entity.getCard().rank));
    }

    private String getRank(Card.Rank rank) {
        return rank.toString();
    }
}
