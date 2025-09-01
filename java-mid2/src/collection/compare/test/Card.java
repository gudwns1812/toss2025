package collection.compare.test;

public class Card {
    private String kind;
    private int number;

    public Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String getKind() {
        return kind;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return number + "(" + kind + ")";
    }
}
