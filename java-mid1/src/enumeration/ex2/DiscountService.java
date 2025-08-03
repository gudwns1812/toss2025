package enumeration.ex2;

import static enumeration.ex2.ClassGrade.*;

public class DiscountService {
    public int discount(ClassGrade grade, int price) {
        int discountPercent = 0;

        if (grade == BASIC) {
            discountPercent = 10;
        } else if (grade == GOLD) {
            discountPercent = 20;
        } else if (grade == DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인X");
        }

        return price * discountPercent / 100; // 할인 금액 계산
    }
}
