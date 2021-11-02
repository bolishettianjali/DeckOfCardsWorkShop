package com.deckOfCards;

import java.util.LinkedList;

public class Players {
    public String playerName;
    public LinkedList<Card> cards;

    public Players(String playerName) {
        this.playerName = playerName;
        cards = new LinkedList<>();
    }

    @Override
    public String toString() {
        return "playerName=" + playerName;
    }
}