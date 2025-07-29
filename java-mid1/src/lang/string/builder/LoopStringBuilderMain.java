package lang.string.builder;

public class LoopStringBuilderMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            result.append("Hello, World! "); // 문자열을 반복적으로 추가
        }

        long endTime = System.currentTimeMillis();
        System.out.println("result = " + result);
        System.out.println("String concatenation time: " + (endTime - startTime) + " ms");
    }
}
