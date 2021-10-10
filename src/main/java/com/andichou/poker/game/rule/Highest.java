package com.andichou.poker.game.rule;

import com.andichou.poker.game.rank.GameRank;
import com.andichou.poker.hand.Hand;

public class Highest implements Rule {

    @Override
    public boolean isCanApplyRule(Hand hand) {
        return true; // default rule
    }

    @Override
    public GameRank apply(Hand hand) {
        return GameRank.highest(hand.highestCard());
    }
}
