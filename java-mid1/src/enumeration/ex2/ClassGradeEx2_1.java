package enumeration.ex2;


import static enumeration.ex2.ClassGrade.*;

public class ClassGradeEx2_1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(BASIC, price);
        int gold = discountService.discount(GOLD, price);
        int diamond = discountService.discount(DIAMOND, price);

        System.out.println("BASIC: " + basic + "원 할인");
        System.out.println("GOLD: " + gold + "원 할인");
        System.out.println("DIAMOND: " + diamond + "원 할인");
    }
}
