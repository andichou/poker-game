package com.andichou.poker.game.rule;

import com.andichou.poker.game.rank.GameRank;
import com.andichou.poker.hand.Hand;

public class StraightFlush implements Rule {

    @Override
    public boolean isCanApplyRule(Hand hand) {
        Rule straight = new Straight();
        Rule flush = new Flush();

        return straight.isCanApplyRule(hand) && flush.isCanApplyRule(hand);
    }

    @Override
    public GameRank apply(Hand hand) {
        return GameRank.straightFlush(hand.highestCard());
    }
}
