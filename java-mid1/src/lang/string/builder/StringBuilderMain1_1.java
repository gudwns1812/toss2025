package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");

        System.out.println("sb = " + sb);

        sb.insert(4, "Java");
        System.out.println("sb = " + sb);

        sb.delete(4, 8); // "Java"를 삭제
        System.out.println("sb = " + sb);

        sb.reverse();
        System.out.println("sb = " + sb);

        //StringBuilder -> String
        String str = sb.toString();
        System.out.println("str = " + str);
    }
}
