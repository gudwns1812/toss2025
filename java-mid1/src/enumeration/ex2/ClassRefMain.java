package enumeration.ex2;

public class ClassRefMain {
    public static void main(String[] args) {
        System.out.println("class BASIC: " + ClassGrade.BASIC.getClass() + "원 할인");
        System.out.println("class GOLD: " + ClassGrade.GOLD.getClass() + "원 할인");
        System.out.println("class DIAMOND: " + ClassGrade.DIAMOND.getClass() + "원 할인");

        System.out.println("ref BASIC: " + ClassGrade.BASIC);
        System.out.println("ref GOLD: " + ClassGrade.GOLD);
        System.out.println("ref DIAMOND: " + ClassGrade.DIAMOND);
    }
}
