package collection.compare.test.correct;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> hand;

    public Player(String name) {
        this.name = name;
        hand = new ArrayList<>();
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public void drawCard(Deck deck) {
        for (int i = 0; i < 5; i++) {
            hand.add(deck.drawCard());
        }
    }

    public int rankSum() {
        int value = 0;
        for (Card card : hand) {
            value += card.getRank();
        }
        return value;
    }

    public void showHand() {
        hand.sort(null);
        System.out.println(name + "의 카드: " + hand + ", 합계: " + rankSum());
    }

    public String getName() {
        return name;
    }
}
