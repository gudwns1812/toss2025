package lang.immutable.change;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableObj a = new ImmutableObj(10);
        ImmutableObj b = a.add(20); // 새로운 객체를 반환
        System.out.println("a = " + a); // a는 여전히 10이다.
        System.out.println("b = " + b); // b는 이제 30이다.
    }
}
