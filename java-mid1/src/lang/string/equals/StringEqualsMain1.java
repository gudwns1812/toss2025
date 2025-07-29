package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("Hello World");
        String str2 = new String("Hello World");

        System.out.println("str1 == str2: " + (str1 == str2)); // true, same reference
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true, same content

        String str3 = "Hello World";
        String str4 = "Hello World";

        System.out.println("str3 == str4: " + (str3 == str4)); // true, same reference in string pool
        System.out.println("str3.equals(str4): " + str3.equals(str4)); // true, same content
    }
}
