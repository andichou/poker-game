package com.andichou.poker.game.rule;

import com.andichou.poker.game.rank.GameRank;
import com.andichou.poker.hand.Hand;

public class Flush implements Rule {

    @Override
    public boolean isCanApplyRule(Hand hand) {
        return hand.isAllCardSameSuit();
    }

    @Override
    public GameRank apply(Hand hand) {
        return GameRank.flush(hand.highestCard());
    }
}
