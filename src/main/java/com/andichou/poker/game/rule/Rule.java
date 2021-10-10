package com.andichou.poker.game.rule;

import com.andichou.poker.game.rank.GameRank;
import com.andichou.poker.hand.Hand;

public interface Rule {

    boolean isCanApplyRule(Hand hand);

    GameRank apply(Hand hand);
}
