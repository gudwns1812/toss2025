package collection.compare.test;

import java.util.List;

public class CardGameMain {
    public static void main(String[] args) {
        Player player1 = new Player( "플레이어1");
        Player player2 = new Player( "플레이어2");

        player1.drawCard(new Deck());
        player2.drawCard(new Deck());

        System.out.println(player1);
        System.out.println(player2);
        if (player1.compareTo(player2) == 1) {
            System.out.println(player1.getName() + " 승리");
        } else if (player1.compareTo(player2) == -1) {
            System.out.println(player2.getName() + " 승리");
        } else {
            System.out.println("무승부");

        }
    }
}
