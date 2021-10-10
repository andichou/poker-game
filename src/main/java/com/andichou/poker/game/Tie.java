package com.andichou.poker.game;

public class Tie implements Result {

    public Tie() {
    }

    @Override
    public String toString() {
        return "No winner. Tie.";
    }
}
