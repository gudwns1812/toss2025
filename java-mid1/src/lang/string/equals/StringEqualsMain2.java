package lang.string.equals;

public class StringEqualsMain2 {

    public static void main(String[] args) {
        String str1 = new String("Hello World");// String 인스턴스 생성
        String str2 = new String("Hello World"); // 또 다른 String 인스턴스 생성
        System.out.println("str1 == str2: " + isSame(str1, str2)); // false, 다른 참조

        String str3 = "Hello World";
        String str4 = "Hello World"; // 동일한 문자열 리터럴, 같은 참조
        System.out.println("str3 == str4: " + isSame(str3, str4)); // true, 같은 참조

    }

    private static boolean isSame(String x, String y) {
//        return x == y; // 참조 비교
        return x.equals(y); // 내용 비교
    }
}
