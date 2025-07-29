package lang.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유한다.
        Address a = new Address("서울시 강남구 역삼동");
        Address b = new Address("서울시 강남구 역삼동"); // a와 b는 서로 다른 인스턴스이다.

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("서울시 강남구 삼성동"); // b의 값을 변경한다.
        System.out.println("a = " + a); // a는 이제 삼성동이다.
        System.out.println("b = " + b); // b는 이제 삼성동이다.
    }
}
