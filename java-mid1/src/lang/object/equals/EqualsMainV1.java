package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("user1");
        UserV1 user2 = new UserV1("user2");

        System.out.println("identity = " + (user1 == user2)); // false
        System.out.println("equality = " + user1.equals(user2)); // false

        // user1과 user3는 id가 같지만, equals 메서드가 오버라이드되지 않아 false를 반환합니다.
    }
}
