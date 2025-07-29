package lang.string.immutable;

public class StringImmutable2 {
    public static void main(String[] args) {
        String str = "hello";
        String result = str.concat("java");
        System.out.println("str = " + str); // str는 여전히 "hello"
        System.out.println("result = " + result); // result는 "hellojava"
    }
}
