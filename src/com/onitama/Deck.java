package com.onitama;

import java.util.Arrays;
import java.util.Collections;

public class Deck {
    private static Card allCards[];

    public static void init() {
        allCards = new Card[Card.allCards.size()];

        shuffle();
    }

    public static Card[] draw() {
        return Arrays.copyOfRange(allCards,0,5);
    }

    public static void shuffle() {
        Collections.shuffle(Card.allCards);
        for (int i = 0; i < 5; i++)
            allCards[i] = Card.allCards.get(i);
    }
}
