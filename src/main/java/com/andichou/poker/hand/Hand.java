package com.andichou.poker.hand;

import com.andichou.poker.card.Card;
import com.andichou.poker.common.error.CardLengthException;
import com.andichou.poker.card.FourCard;
import com.andichou.poker.card.ThreeCard;
import com.andichou.poker.card.TwoCard;
import com.andichou.poker.player.PlayerCard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Hand {

    private PlayerCard playerCard;

    public Hand(Card... cards) {
        if (cards.length != 5) {
            throw new CardLengthException("Card length is not 5 cards");
        }

        playerCard = new PlayerCard(Arrays.asList(cards));
    }

    public Card highestCard() {
        return playerCard.highestCard();
    }

    public boolean isAllCardSameSuit() {
        return playerCard.getAllSuits().size() == 1;
    }

    public boolean isAllCardSequence() {
        return playerCard.hasAllSequence();
    }

    public boolean hasTwoCardSameRank() {
        return getTwoCardSameRank().isPresent();
    }

    public boolean hasThreeCardSameRank() {
        return getThreeCardSameRank().isPresent();
    }

    public boolean hasFourCardSameRank() {
        return getFourCardSameRank().isPresent();
    }

    public Optional<List<TwoCard>> getTwoPairOfTwoCardSameRank() {
        List<TwoCard> twoCards = new ArrayList<>();
        PlayerCard remainingCard = playerCard;

        while (remainingCard.size() >= 2) {
            if (remainingCard.getAllCardSameRank(2).isEmpty()) {
                return Optional.empty();
            }

            List<Card> cards = remainingCard.getAllCardSameRank(2).get();
            TwoCard twoCard = new TwoCard(cards.get(0), cards.get(1));
            twoCards.add(twoCard);
            remainingCard = remainingCard.getAllExcept(cards.get(0), cards.get(1));
        }

        return Optional.of(twoCards);
    }

    public Optional<TwoCard> getTwoCardSameRank() {
        return playerCard.getAllCardSameRank(2)
            .map(cards -> new TwoCard(cards.get(0), cards.get(1)));
    }

    public Optional<ThreeCard> getThreeCardSameRank() {
        return playerCard.getAllCardSameRank(3)
            .map(cards -> new ThreeCard(cards.get(0), cards.get(1), cards.get(2)));
    }

    public Optional<FourCard> getFourCardSameRank() {
        return playerCard.getAllCardSameRank(4)
            .map(cards -> new FourCard(cards.get(0), cards.get(1), cards.get(2), cards.get(3)));
    }

    public PlayerCard getAllCardExcept(Card... excludes) {
        return playerCard.getAllExcept(excludes);
    }
}
