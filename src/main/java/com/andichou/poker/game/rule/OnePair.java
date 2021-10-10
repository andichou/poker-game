package com.andichou.poker.game.rule;

import com.andichou.poker.card.TwoCard;
import com.andichou.poker.game.rank.GameRank;
import com.andichou.poker.hand.Hand;
import com.andichou.poker.player.PlayerCard;

public class OnePair implements Rule {

    @Override
    public boolean isCanApplyRule(Hand hand) {
        return hand.hasTwoCardSameRank();
    }

    @Override
    public GameRank apply(Hand hand) {
        TwoCard twoCards = hand.getTwoCardSameRank().get();
        PlayerCard except = hand.getAllCardExcept(twoCards.getFirst(), twoCards.getSecond());
        return GameRank.onePair(twoCards.getFirst(), twoCards.getSecond(), except.highestCard());
    }
}
