package enumeration.ref2;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    Grade(int discountPercent) {
        this.discountPercent = discountPercent; // 생성자에서 할인 비율을 초기화
    }

    public int getDiscountPercent() {
        return discountPercent; // 할인 비율을 반환하는 메서드
    }

}
