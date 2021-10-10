package com.andichou.poker.card;

import java.util.HashMap;
import java.util.Map;

public class CardMapping {

    public static final Map<String, Card.Rank> MAP_RANK = new HashMap<String, Card.Rank>() {{
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

    public static final Map<Character, Card.Suit> MAP_SUIT = new HashMap<Character, Card.Suit>() {{
        put('S', Card.Suit.SPADES);
        put('H', Card.Suit.HEARTS);
        put('C', Card.Suit.CLUBS);
        put('D', Card.Suit.DIAMONDS);
    }};
}
