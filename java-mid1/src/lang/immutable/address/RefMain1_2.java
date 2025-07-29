package lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울시 강남구 역삼동");
        ImmutableAddress b = a.withValue("서울시 강남구 대치동"); // 새로운 인스턴스를 생성하여 b에 할당

        System.out.println("a = " + a); // a는 여전히 역삼동이다.
        System.out.println("b = " + b); // b는 이제 대치동이다.
    }
}
