package enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("class BASIC: " + Grade.BASIC.getClass() + "원 할인");
        System.out.println("class GOLD: " + Grade.GOLD.getClass() + "원 할인");
        System.out.println("class DIAMOND: " + Grade.DIAMOND.getClass() + "원 할인");

        System.out.println("ref BASIC: " + refValue(Grade.BASIC));
        System.out.println("ref GOLD: " + refValue(Grade.GOLD));
        System.out.println("ref DIAMOND: " + refValue(Grade.DIAMOND));
    }

    private static String refValue(Grade grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
