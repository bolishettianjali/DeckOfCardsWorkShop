package com.deckOfCards;

import java.util.*;

public class DeckOfCards {
    static Scanner scanner = new Scanner(System.in);
    private static final String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private static final String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private static LinkedList<Card> deckOfCards = new LinkedList<>();
    private static ArrayList<Players> playersList = new ArrayList<>();

    public static void main(String[] args) {
        createCards();
        addPlayers();
        shuffleCards();
    }

    /*
    This method is used to Shuffle the cards in list
    Using Collections class shuffle() method.
     */
    public static void shuffleCards() {
        Collections.shuffle(deckOfCards);
    }

    /*
    This method is to create players.
    Taking player name through console.
    Creating Players class object and assigning player name.
    assigned Players object added to playersList.
    */
    public static void addPlayers() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("\nEnter Player-" + i + " Name: ");
            String playerName = scanner.next();
            Players players = new Players(playerName);
            playersList.add(players);
        }
    }

    /*
    This method is to Create a Card.
    creating a Card class Object and assigning suit and rank to object.
    Assigned object is added to deck of Cards list.
    */
    public static void createCards() {
        for (String suit : suit) {
            for (String rank : rank) {
                Card card = new Card(suit, rank);
                deckOfCards.add(card);
            }
        }
    }
}