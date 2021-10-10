package com.andichou.poker.game.rule;

import com.andichou.poker.game.rank.GameRank;
import com.andichou.poker.hand.Hand;

public class FullHouse implements Rule {

    @Override
    public boolean isCanApplyRule(Hand hand) {
        Rule threePair = new ThreePair();
        Rule twoPair = new TwoPair();

        return threePair.isCanApplyRule(hand) && twoPair.isCanApplyRule(hand);
    }

    @Override
    public GameRank apply(Hand hand) {
        return GameRank.fullHouse(hand.highestCard());
    }
}
