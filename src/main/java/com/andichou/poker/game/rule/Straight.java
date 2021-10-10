package com.andichou.poker.game.rule;

import com.andichou.poker.game.rank.GameRank;
import com.andichou.poker.hand.Hand;

public class Straight implements Rule {

    @Override
    public boolean isCanApplyRule(Hand hand) {
        return hand.isAllCardSequence();
    }

    @Override
    public GameRank apply(Hand hand) {
        return GameRank.straight(hand.highestCard());
    }
}
