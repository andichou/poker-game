package com.andichou.poker;

import com.andichou.poker.deck.Deck;

public class Game {

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
    }
}
