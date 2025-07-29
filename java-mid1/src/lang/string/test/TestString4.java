package lang.string.test;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String substring = str.substring(0, 5);
        String extName = str.substring(5, 9);
        System.out.println("substring = " + substring); // substring = hello
        System.out.println("extName = " + extName); // extName = .txt
    }
}
