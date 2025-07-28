package lang.immutable.address;

public class RefMain1_3 {

        public static void main(String[] args) {
            //참조형 변수는 하나의 인스턴스를 공유한다.
            Address a = new Address("서울시 강남구 역삼동");
            Address b = a;
            System.out.println("a = " + a);
            System.out.println("b = " + b);

            change(b, "부산");
            System.out.println("a = " + a); // a는 이제 삼성동이다.
            System.out.println("b = " + b); // b는 이제 삼성동이다.
    }

    private static void change(Address address, String value) {
        address.setValue(value); // 주소값을 변경하는 것이 아니라, 주소값이 가리키는 객체의 값을 변경한다.
        // 즉, address는 여전히 같은 인스턴스를 가리키고 있다.
    }
}
