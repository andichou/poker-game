package com.andichou.poker.game.rule;

import com.andichou.poker.card.ThreeCard;
import com.andichou.poker.game.rank.GameRank;
import com.andichou.poker.hand.Hand;

public class ThreePair implements Rule {

    @Override
    public boolean isCanApplyRule(Hand hand) {
        return hand.hasThreeCardSameRank();
    }

    @Override
    public GameRank apply(Hand hand) {
        ThreeCard threeCard = hand.getThreeCardSameRank().get();
        return GameRank.threePair(threeCard.getFirst().rank);
    }
}
