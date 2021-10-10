package com.andichou.poker.game;

import com.andichou.poker.game.rank.GameRank;
import com.andichou.poker.game.rule.GameRule;
import com.andichou.poker.player.Player;

import java.util.Objects;

public class Gameplay {

    private final GameRule rules;

    public Gameplay(GameRule rules) {
        this.rules = rules;
    }

    public Result run(Player firstPlayer, Player secondPlayer) {
        GameRank firstPlayerRank = rules.evaluate(firstPlayer.hand);
        GameRank secondPlayerRank = rules.evaluate(secondPlayer.hand);

        if (firstPlayerRank.isHigher(secondPlayerRank)) {
            return new Winner(firstPlayer);
        }
        if (secondPlayerRank.isHigher(firstPlayerRank)){
            return new Winner(secondPlayer);
        }

        return Result.tie;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Gameplay gameplay = (Gameplay) object;
        return Objects.equals(rules, gameplay.rules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rules);
    }
}
