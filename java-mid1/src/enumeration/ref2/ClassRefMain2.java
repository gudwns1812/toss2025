package enumeration.ref2;

public class ClassRefMain2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(Grade.BASIC, price);
        int gold = discountService.discount(Grade.GOLD, price);
        int diamond = discountService.discount(Grade.DIAMOND, price);

        System.out.println("BASIC: " + basic + "원 할인");
        System.out.println("GOLD: " + gold + "원 할인");
        System.out.println("DIAMOND: " + diamond + "원 할인");
    }
}
