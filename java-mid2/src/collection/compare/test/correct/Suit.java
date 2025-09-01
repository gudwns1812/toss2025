package collection.compare.test.correct;

public enum Suit {
    SPADE("♠"),
    HEART("♥"),
    DIAMOND("♦"),
    CLOVER("♣");

    private String icon;

    Suit(String kind) {
        this.icon = kind;
    }

    public String getIcon() {
        return icon;
    }
}
