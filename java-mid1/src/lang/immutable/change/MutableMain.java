package lang.immutable.change;

public class MutableMain {
    public static void main(String[] args) {
        MutableObj a = new MutableObj(10);
        a.add(20);
        System.out.println("a = " + a); // a는 이제 30이다.
    }
}
