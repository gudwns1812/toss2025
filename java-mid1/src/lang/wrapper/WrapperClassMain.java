package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer integer = new Integer(10); // Deprecated, use Integer.valueOf() instead
        Integer integer1 = Integer.valueOf(10); // Preferred way to create an Integer object
        Integer integerObj = Integer.valueOf(10); // -128 to 127 범위의 캐싱된 값 사용
        Long l = Long.valueOf(100);
        Double v = Double.valueOf(3.14);
        System.out.println("integer = " + integer);
        int i = integerObj.intValue();
        System.out.println("i = " + i);

        System.out.println("== " + (integer1 == integerObj)); // true, 캐싱된 값이므로 같은 객체 참조
        System.out.println("equals = " + integer.equals(integerObj)); // true, 값이 같으므로 equals()도 true
    }
}
