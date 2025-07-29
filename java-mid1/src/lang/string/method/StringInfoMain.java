package lang.string.method;

public class StringInfoMain {
    public static void main(String[] args) {
        // 문자열의 길이
        String str = "Hello, Java!";
        int length = str.length();
        System.out.println("문자열의 길이: " + length);

        System.out.println("문자열이 비어 있는지: " + str.isEmpty());
        System.out.println("문자열이 비어 있거나 공백인지: " + str.isBlank());
        System.out.println("         ".isBlank());

        // 문자열의 특정 문자 가져오기
        char ch = str.charAt(0);
        System.out.println("첫 번째 문자: " + ch);

        // 문자열의 부분 문자열 가져오기
        String subStr = str.substring(7, 11);
        System.out.println("부분 문자열: " + subStr);

        // 문자열의 인덱스 찾기
        int index = str.indexOf("Java");
        System.out.println("'Java'의 인덱스: " + index);
    }
}
