package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello World";

        //valueOf 메서드
        String numStr = String.valueOf(num); // int를 String으로 변환
        System.out.println("int to String: " + numStr);
        String boolStr = String.valueOf(bool); // boolean을 String으로 변환
        System.out.println("boolean to String: " + boolStr);
        String objStr = String.valueOf(obj); // Object를 String으로 변환
        System.out.println("Object to String: " + objStr);

        String numStr2 = "" + num; // int를 String으로 변환
        System.out.println("int to String using concatenation: " + numStr2);

        // toCharArray 메서드
        char[] charArray = str.toCharArray(); // 문자열을 문자 배열로 변환
        System.out.println("charArray = " + charArray);
        System.out.println(charArray);
    }
}
