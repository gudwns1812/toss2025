package lang.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, World";

        //format 메서드
        String formattedStr = String.format("Number: %d, Boolean: %b, Object: %s", num, bool, obj);
        System.out.println("Formatted String: " + formattedStr);

        String format2 = String.format("숫자: %.2f", 10.12345);// 소수점 둘째 자리까지 포맷팅
        System.out.println("format2 = " + format2);

        System.out.printf("숫자: %.2f\n", 10.12345); // printf를 사용하여 소수점 둘째 자리까지 출력

        String regex = "Hello, (Java!|World)"; // 정규 표현식
        System.out.println("정규 표현식: " + str.matches(regex));

    }
}
