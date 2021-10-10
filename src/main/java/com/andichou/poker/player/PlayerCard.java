package com.andichou.poker.player;

import com.andichou.poker.card.Card;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class PlayerCard {

    private final List<Card> cards;

    public PlayerCard(List<Card> cards) {
        this.cards = cards;
    }

    public boolean hasAllSequence() {
        this.sort();

        for (int i = 1; i < cards.size(); i++) {
            if (!cards.get(i - 1).isSequence(cards.get(i))) return false;
        }

        return true;
    }

    public Set<Card.Suit> getAllSuits() {
        return cards.stream().map(card -> card.suit).collect(Collectors.toSet());
    }

    public Optional<List<Card>> getAllCardSameRank(int size) {
        return getCardBiggerRank(size).map(playerCards -> playerCards.subList(0, size));
    }

    public Card highestCard() {
        return cards.stream().max(Card::compareTo).get();
    }

    public PlayerCard getAllExcept(Card... excludes) {
        List<Card> remainingCards = cards.stream().filter(card -> !Arrays.asList(excludes).contains(card))
            .collect(Collectors.toList());
        return new PlayerCard(remainingCards);
    }

    public Collection<List<Card>> groupByRank() {
        return cards.stream().collect(Collectors.groupingBy(card -> card.rank)).values();
    }

    public int size() {
        return cards.size();
    }

    public void sort() {
        cards.sort(Card::compareTo);
    }

    private Optional<List<Card>> getCardBiggerRank(int size) {
        Collection<List<Card>> TEST = groupByRank();
        return groupByRank().stream().filter(playerCards -> playerCards.size() >= size).findFirst();
    }
}
