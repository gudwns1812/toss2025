package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        Integer integer = Integer.valueOf(str);
        System.out.println("integer = " + integer);

        int i = integer.intValue();
        System.out.println("i = " + i);

        Integer integer2 = Integer.valueOf(i);
        System.out.println("integer2 = " + integer2);
    }
}
