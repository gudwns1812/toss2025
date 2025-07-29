package lang.string.method;

public class StringChangeMain2 {

    public static void main(String[] args) {
        String strWithSpaces = "        Java Programming        ";// 앞뒤 공백 제거

        System.out.println("소문자로 변경: " + strWithSpaces.toLowerCase()); // 소문자로 변경
        System.out.println("대문자로 변경: " + strWithSpaces.toUpperCase()); // 대문자로 변경

        System.out.println("앞뒤 공백 제거: " + strWithSpaces.trim()); // 앞뒤 공백 제거
        System.out.println("공백 제거(strip): " + strWithSpaces.strip()); // 앞뒤 공백 제거 (Java 11 이상)

        System.out.println("왼쪽 공백 제거: " + strWithSpaces.stripLeading()); // 왼쪽 공백 제거 (Java 11 이상)
        System.out.println("오른쪽 공백 제거: " + strWithSpaces.stripTrailing()); // 오른쪽 공백 제거 (Java 11 이상)
    }
}
