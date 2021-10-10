import com.andichou.poker.card.Card;
import com.andichou.poker.card.TwoCard;
import com.andichou.poker.hand.Hand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class HandTest {

    @Test
    void getTwoCardSameRankSuccess() {
        Hand hand = new Hand(
            new Card(Card.Rank.TWO, Card.Suit.CLUBS),
            new Card(Card.Rank.TWO, Card.Suit.SPADES),
            new Card(Card.Rank.TEN, Card.Suit.CLUBS),
            new Card(Card.Rank.EIGHT, Card.Suit.CLUBS),
            new Card(Card.Rank.THREE, Card.Suit.SPADES)
        );
        TwoCard response = new TwoCard(
            new Card(Card.Rank.TWO, Card.Suit.CLUBS),
            new Card(Card.Rank.TWO, Card.Suit.SPADES)
        );
        Assertions.assertEquals(response, hand.getTwoCardSameRank().get());
    }

    @Test
    void getTwoCardSameRankFail() {
        Hand hand = new Hand(
            new Card(Card.Rank.TWO, Card.Suit.CLUBS),
            new Card(Card.Rank.THREE, Card.Suit.CLUBS),
            new Card(Card.Rank.FIVE, Card.Suit.CLUBS),
            new Card(Card.Rank.FOUR, Card.Suit.CLUBS),
            new Card(Card.Rank.SIX, Card.Suit.CLUBS)
        );
        Assertions.assertEquals(hand.getTwoCardSameRank(), Optional.empty());
    }
}
