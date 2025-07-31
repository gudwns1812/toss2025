package lang.wrapper;

public class MyIntegerMethodMain1 {
    public static void main(String[] args) {
        MyInteger myInt = new MyInteger(10);
        int i1 = myInt.compareTo(5);
        int i2 = myInt.compareTo(10);
        int i3 = myInt.compareTo(15);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }
}
