package com.homeworkstuff.homework3.somecardstuff;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<Card> deckOfCards = createDeck();
        List<Card> firstPlayerHand = tossCards(deckOfCards);
        List<Card> secondPlayerHand = tossCards(deckOfCards);

        System.out.println("First player hand:");
        printCards(firstPlayerHand);

        System.out.println("Second player hand:");
        printCards(secondPlayerHand);

        System.out.println("Current deck:");
        printCards(deckOfCards);
    }

    public static List<Card> createDeck() {
        List<Card> deckOfCards = new ArrayList<>();
        for (Suits suits : Suits.values()) {
            for (Ranks ranks : Ranks.values()) {
                deckOfCards.add(new Card(suits, ranks));
            }
        }
        return deckOfCards;
    }

    public static Card pullRandomCard(List<Card> deck) {
        Random random = new Random();
        if (deck.isEmpty()) {
            return null;
        }

        Card result = deck.remove(random.nextInt(deck.size() - 1));
        return result;
    }

    public static List<Card> tossCards(List<Card> deck) {
        List<Card> playerHand = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            playerHand.add(pullRandomCard(deck));
        }
        return playerHand;
    }

    public static void printCards(List<Card> cards) {
        for (Card card : cards) {
            System.out.println(card);
        }
    }
}
