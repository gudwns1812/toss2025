package lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmutableObj a = new ImmutableObj(10);
        a.add(20); // 새로운 객체를 반환
        System.out.println("a = " + a); // a는 여전히 10이다.
    }
}
