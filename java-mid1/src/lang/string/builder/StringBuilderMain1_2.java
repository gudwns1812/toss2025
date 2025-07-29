package lang.string.builder;

public class StringBuilderMain1_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String result = sb.append("A").append("B").append("C").append("D")
                .insert(4, "Java") // "Java"를 4번째 위치에 삽입
                .delete(4, 8) // "Java"를 삭제
                .reverse() // 문자열을 뒤집기
                .toString();

        System.out.println("str = " + result);
    }
}
