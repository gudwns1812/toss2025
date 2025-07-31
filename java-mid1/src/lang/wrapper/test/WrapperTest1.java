package lang.wrapper.test;

public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        Integer integer = Integer.valueOf(str1);
        Integer integer2 = Integer.valueOf(str2);
        int sum = integer + integer2;
        System.out.println("sum = " + sum); // sum = 30


    }
}
