package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Java,Python,C++,JavaScript";

        // 문자열 분할
        String[] languages = str.split(","); // 쉼표(,)를 기준으로 분할
        System.out.println("분할된 문자열:");
        for (String language : languages) {
            System.out.println(language);
        }

        // 문자열 결합
        String joined = String.join(" | ", languages); // " | "로 결합
        System.out.println("결합된 문자열: " + joined);
    }
}
