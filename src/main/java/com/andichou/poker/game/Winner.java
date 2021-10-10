package com.andichou.poker.game;

import com.andichou.poker.game.rank.GameRank;
import com.andichou.poker.game.rule.GameRule;
import com.andichou.poker.player.Player;

import java.util.Objects;

public class Winner implements Result {

    private final Player player;

    public Winner(Player player) {
        this.player = player;
    }

    public GameRank gameRank() {
        return new GameRule().evaluate(player.hand);
    }

    public Player getPlayer() {
        return player;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Winner winner = (Winner) object;
        return Objects.equals(player, winner.player);
    }

    @Override
    public int hashCode() {
        return Objects.hash(player);
    }
}
