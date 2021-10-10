package com.andichou.poker.deck;

import com.andichou.poker.card.Card;
import com.andichou.poker.card.CardMapping;
import com.andichou.poker.common.constants.GeneralConstant;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Deck {

    // deck will have 52 card as regular card exclude joker
    private Card[] deck;

    public Deck() {
        deck = new Card[GeneralConstant.DECK_NUMBER];
        int index = 0;

        for (Map.Entry<Character, Card.Suit> suit : CardMapping.MAP_SUIT.entrySet()) {
            for (Map.Entry<String, Card.Rank> rank : CardMapping.MAP_RANK.entrySet()) {
                deck[index] = new Card(rank.getValue(), suit.getValue());
                index++;
            }
        }
    }

    public void shuffle() {
        List<Card> deckList = Arrays.asList(deck);
        Collections.shuffle(deckList);
        deckList.toArray(deck);
        System.out.println(Arrays.toString(deck));
    }
}
