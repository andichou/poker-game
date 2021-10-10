package com.andichou.poker.player;

import com.andichou.poker.card.TwoCard;
import com.andichou.poker.hand.Hand;

import java.util.Objects;

public class Player {

    public final Hand hand;

    public final String name;

    public Player(Hand hand, String name) {
        this.hand = hand;
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Player player = (Player) object;
        return Objects.equals(hand, player.hand) && Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hand, name);
    }
}
