package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울시 강남구 역삼동");

        MemberV2 memberA = new MemberV2("회원A", address);
        MemberV2 memberB = new MemberV2("회원B", address);

        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

//        memberB.getAddress().setValue("부산시 해운대구"); // ImmutableAddress는 불변 객체이므로, 주소를 변경할 수 없다.
        memberB.setAddress(new ImmutableAddress("부산"));
        System.out.println("memberA = " + memberA); // memberA의 주소는 여전히 역삼동이다.
        System.out.println("memberB = " + memberB); // memberB의 주소는 이제 부산이다.
    }
}
