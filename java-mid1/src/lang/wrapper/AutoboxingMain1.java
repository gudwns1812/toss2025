package lang.wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args) {
        //Primitives to Wrapper Objects
        int value = 7;
        Integer integer = value; // Autoboxing: int to Integer

        //Wrapper Objects to Primitives
        int i = integer; // Unboxing: Integer to int

        System.out.println("integer = " + integer);
        System.out.println("i = " + i);
    }
}
