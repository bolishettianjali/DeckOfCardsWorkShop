package com.deckOfCards;

import java.util.LinkedList;

public class DeckOfCards {
    private static final String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private static final String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private static LinkedList<Card> deckOfCards = new LinkedList<>();

    public static void main(String[] args) {
        createCards();
    }

    /*
    This method is to Create a Card.
     creating a Card class Object and assigning suit and rank to object.
     Assigned object is added to deck of Cards list.
     */
    public static void createCards() {
        for (String suit : DeckOfCards.suit) {
            for (String rank : DeckOfCards.rank) {
                Card card = new Card(suit, rank);
                deckOfCards.add(card);
            }
        }
    }
}