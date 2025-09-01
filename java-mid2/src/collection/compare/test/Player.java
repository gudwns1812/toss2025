package collection.compare.test;

import java.util.ArrayList;
import java.util.List;

public class Player implements Comparable<Player> {
    private final List<Card> hand = new ArrayList<>();
    private final String name;

    public Player(String name) {
        this.name = name;
    }

    public Integer getTotalValue() {
        int total = 0;
        for (Card card : hand) {
            total += card.getNumber();
        }
        return total;
    }
    public String getName() {
        return name;
    }

    public void drawCard(Deck deck) {
        hand.add(deck.draw());
        hand.add(deck.draw());
        hand.add(deck.draw());
        hand.add(deck.draw());
        hand.add(deck.draw());
    }

    @Override
    public int compareTo(Player o) {
        return this.getTotalValue().compareTo(o.getTotalValue());
    }

    @Override
    public String toString() {
        return name + "의 카드: " + hand + ", 합계: " + getTotalValue();
    }
}
