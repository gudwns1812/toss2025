package enumeration.ref1;


public class DiscountService {
    public int discount(ClassGrade grade, int price) {
        return price * grade.getDiscountPercent() / 100; // 할인 금액 계산

    }
}
