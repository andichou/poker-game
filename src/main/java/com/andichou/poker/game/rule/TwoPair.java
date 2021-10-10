package com.andichou.poker.game.rule;

import com.andichou.poker.card.TwoCard;
import com.andichou.poker.game.rank.GameRank;
import com.andichou.poker.hand.Hand;

import java.util.List;

public class TwoPair implements Rule {

    @Override
    public boolean isCanApplyRule(Hand hand) {
        return hand.getTwoPairOfTwoCardSameRank().isPresent();
    }

    @Override
    public GameRank apply(Hand hand) {
        List<TwoCard> twoCards = hand.getTwoPairOfTwoCardSameRank().get();
        return GameRank.twoPair(twoCards.get(0).getFirst().rank, twoCards.get(1).getFirst().rank);
    }
}
