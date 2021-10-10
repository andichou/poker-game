package com.andichou.poker.game.rule;

import com.andichou.poker.card.FourCard;
import com.andichou.poker.game.rank.GameRank;
import com.andichou.poker.hand.Hand;

public class FourPair implements Rule {

    @Override
    public boolean isCanApplyRule(Hand hand) {
        return hand.hasFourCardSameRank();
    }

    @Override
    public GameRank apply(Hand hand) {
        FourCard fourCard = hand.getFourCardSameRank().get();
        return GameRank.fourPair(fourCard.getFirst().rank);
    }
}
