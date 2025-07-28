package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유한다.
        ImmutableAddress a = new ImmutableAddress("서울시 강남구 역삼동");
        ImmutableAddress b = a; // 참조값 대입을 막을 수 있는 방법이 없다.

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = new ImmutableAddress("서울시 강남구 삼성동"); // b는 이제 새로운 인스턴스를 가리킨다.
        System.out.println("a = " + a);
        System.out.println("b = " + b); // b는 이제 삼성동이다.
    }
}
