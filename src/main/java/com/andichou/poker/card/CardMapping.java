package com.andichou.poker.card;

import java.util.HashMap;
import java.util.Map;

public class CardMapping {

    Card convert(String payload) {
        String rank = payload.substring(0, payload.length() - 2); // get all rank characters before suit character
        Character suit = payload.charAt(payload.length() - 1);

        return new Card(MAP_TO_RANK.get(rank), MAP_TO_SUIT.get(suit));
    }

    private static final Map<String, Card.Rank> MAP_TO_RANK = new HashMap<String, Card.Rank>() {{
        put("2", Card.Rank.TWO);
        put("3", Card.Rank.THREE);
        put("4", Card.Rank.FOUR);
        put("5", Card.Rank.FIVE);
        put("6", Card.Rank.SIX);
        put("7", Card.Rank.SEVEN);
        put("8", Card.Rank.EIGHT);
        put("9", Card.Rank.NINE);
        put("10", Card.Rank.TEN);
        put("11", Card.Rank.JACK);
        put("12", Card.Rank.QUEEN);
        put("13", Card.Rank.KING);
        put("14", Card.Rank.ACE);
    }};

    private static final Map<Character, Card.Suit> MAP_TO_SUIT = new HashMap<Character, Card.Suit>() {{
        put('S', Card.Suit.SPADES);
        put('H', Card.Suit.HEARTS);
        put('C', Card.Suit.CLUBS);
        put('D', Card.Suit.DIAMONDS);
    }};
}
