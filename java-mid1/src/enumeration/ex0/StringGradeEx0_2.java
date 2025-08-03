package enumeration.ex0;

public class StringGradeEx0_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        // 존재 하지 않는 등급
        int vip = discountService.discount("VIP", price);// VIP 등급은 할인 서비스에 정의되어 있지 않음
        System.out.println("VIP: " + vip + "원 할인"); // 할인 금액이 0원으로 출력됨

        // 오타
        int diamondd = discountService.discount("DIAMONDD", price);// DIAMONDD는 오타로, 할인 서비스에 정의되어 있지 않음
        System.out.println("DIAMONDD: " + diamondd + "원 할인"); // 할인 금액이 0원으로 출력됨

        // 소문자 입력
        int diamondLower = discountService.discount("diamond", price);// 소문자로 입력했지만, 할인 서비스에 정의되어 있지 않음
        System.out.println("diamond: " + diamondLower + "원 할인"); // 할인 금액이 0원으로 출력됨
    }
}
