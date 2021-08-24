package com.homeworkstuff.homework3.somecardstuff;

public class Card {

    private Suits suit;
    private Ranks rank;

    public Card(Suits suit, Ranks rank) {
        this.suit = suit;
        this.rank = rank;

    }

    @Override
    public String toString() {
        return String.format("Card: suit - %s, rank - %s", suit, rank);
    }
}
