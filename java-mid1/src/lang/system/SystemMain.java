package lang.system;

import java.util.Arrays;
import java.util.Map;

public class SystemMain {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        System.out.println("CurrentTimeMillis = " + l);

        long l2 = System.nanoTime();
        System.out.println("CurrentTimeNano = " + l2);

        System.out.println("getenv = " + System.getenv());

        System.out.println("properties = " + System.getProperties());
        System.out.println("java.version = " + System.getProperty("java.version"));

        //배열을 고속으로 복사한다.
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[originalArray.length];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);
        System.out.println("Original Array: " + Arrays.toString(copiedArray));
        System.err.println(10);
        System.exit(0);
    }
}
