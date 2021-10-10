package com.andichou.poker.game.rule;

import com.andichou.poker.game.rank.GameRank;
import com.andichou.poker.hand.Hand;

public class RoyalFlush implements Rule {

    @Override
    public boolean isCanApplyRule(Hand hand) {
        Rule straightFlush = new StraightFlush();

        return straightFlush.isCanApplyRule(hand) && hand.highestCard().rank.isAce(hand.highestCard().rank);
    }

    @Override
    public GameRank apply(Hand hand) {
        return GameRank.royalFlush(hand.highestCard());
    }
}
