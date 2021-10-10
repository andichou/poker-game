package mocks;

import com.andichou.poker.card.Card;
import com.andichou.poker.hand.Hand;

public class PlayerCardMock {

    public static Hand onePairMock() {
        return new Hand(
            new Card(Card.Rank.FIVE, Card.Suit.DIAMONDS),
            new Card(Card.Rank.FIVE, Card.Suit.SPADES),
            new Card(Card.Rank.SIX, Card.Suit.SPADES),
            new Card(Card.Rank.THREE, Card.Suit.SPADES),
            new Card(Card.Rank.TEN, Card.Suit.SPADES)
        );
    }

    public static Hand onePairMockSameSuit() {
        return new Hand(
            new Card(Card.Rank.FIVE, Card.Suit.SPADES),
            new Card(Card.Rank.FIVE, Card.Suit.SPADES),
            new Card(Card.Rank.SIX, Card.Suit.SPADES),
            new Card(Card.Rank.THREE, Card.Suit.SPADES),
            new Card(Card.Rank.TEN, Card.Suit.SPADES)
        );
    }

    public static Hand highestMock() {
        return new Hand(
            new Card(Card.Rank.FIVE, Card.Suit.DIAMONDS),
            new Card(Card.Rank.ACE, Card.Suit.SPADES),
            new Card(Card.Rank.SIX, Card.Suit.SPADES),
            new Card(Card.Rank.THREE, Card.Suit.SPADES),
            new Card(Card.Rank.TEN, Card.Suit.SPADES)
        );
    }
}
