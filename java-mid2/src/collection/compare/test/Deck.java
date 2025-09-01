package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] kinds = {"♠", "♦", "♥", "♣"};
        int index = 0;
        for (String kind : kinds) {
            for (int number = 1; number <= 13; number++) {
                cards.add(new Card(kind, number));
            }
        }

    }

    public Card draw() {
        Collections.shuffle(cards);
        return cards.removeFirst();
    }

}
