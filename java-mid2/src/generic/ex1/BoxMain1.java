package generic.ex1;

public class BoxMain1 {

    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10);

        Integer integer = integerBox.get();
        System.out.println("IntegerBox contains: " + integer);

        StringBox stringBox = new StringBox();
        stringBox.set("Hello, World!");
        String str = stringBox.get();
        System.out.println("StringBox contains: " + str);
    }
}
