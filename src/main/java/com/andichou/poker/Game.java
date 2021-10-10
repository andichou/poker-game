package com.andichou.poker;

import com.andichou.poker.card.Card;
import com.andichou.poker.common.constants.GeneralConstant;
import com.andichou.poker.deck.Deck;
import com.andichou.poker.game.GameResult;
import com.andichou.poker.game.Gameplay;
import com.andichou.poker.game.Result;
import com.andichou.poker.game.rule.GameRule;
import com.andichou.poker.hand.Hand;
import com.andichou.poker.player.Player;

public class Game {

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        Card[] cards = deck.getDeck();

        Card[] firstHand = new Card[GeneralConstant.MAX_CARD_NUMBER];
        Card[] secondHand = new Card[GeneralConstant.MAX_CARD_NUMBER];

        // generate cards for each player
        for (int i = 0; i < GeneralConstant.MAX_CARD_NUMBER; i++) {
            firstHand[i] = cards[i * 2];
            secondHand[i] = cards[i * 2 + 1];
        }

        Player firstPlayer = new Player(new Hand(firstHand), "Player 1");
        Player secondPlayer = new Player(new Hand(secondHand), "Player 2");

        GameResult gameResult = new GameResult();
        Gameplay gameplay = new Gameplay(new GameRule());
        Result result = gameplay.run(firstPlayer, secondPlayer);
        String message = gameResult.getMessage(result);
        System.out.println(message);
    }
}
