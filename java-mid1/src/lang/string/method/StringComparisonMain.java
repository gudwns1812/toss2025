package lang.string.method;

public class StringComparisonMain {

    public static void main(String[] args) {
        String str1 = "Hello, Java!";
        String str2 = "hello, java!";
        String str3 = "Hello, World!";

        System.out.println("str1 equals str2: " + str1.equals(str2)); // 내용 비교, 대소문자 구분
        System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2)); // 내용 비교, 대소문자 구분 안함

        System.out.println("'b' compareTo 'a': " + "b".compareTo("a")); // 양수, 'b'가 'a'보다 뒤에 있음
        System.out.println("'a' compareTo 'b': " + "a".compareTo("b")); // 음수, 'a'가 'b'보다 앞에 있음
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2)); // 대소문자 구분, 음수
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3)); // 'W'가 'J'보다 뒤에 있으므로 음수

        System.out.println("str1 compareToIgnoreCase str2: " + str1.compareToIgnoreCase(str2)); // 대소문자 구분 안함
    }
}
