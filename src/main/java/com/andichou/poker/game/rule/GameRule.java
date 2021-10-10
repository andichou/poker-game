package com.andichou.poker.game.rule;

import com.andichou.poker.game.rank.GameRank;
import com.andichou.poker.hand.Hand;

import java.util.Arrays;
import java.util.List;

public class GameRule {

    private final List<Rule> gameRules = Arrays.asList(
        new Highest(),
        new OnePair(),
        new TwoPair(),
        new ThreePair(),
        new FourPair(),
        new Flush(),
        new Straight(),
        new FullHouse(),
        new StraightFlush(),
        new RoyalFlush()
    );

    public GameRank evaluate(Hand hand) {
        return gameRules.stream()
            .filter(rule -> rule.isCanApplyRule(hand))
            .map(rule -> rule.apply(hand)).max(GameRank::compareTo).orElse(null);
    }
}
