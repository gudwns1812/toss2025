package lang.wrapper;

public class MyIntegerNullMain1 {

    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1), new MyInteger(2), new MyInteger(3)};
        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 2));
        System.out.println(findValue(intArr, 100));
    }

    private static MyInteger findValue(MyInteger[] arr, int target) {
        for (MyInteger myInteger : arr) {
            if (myInteger.getValue() == target) {
                return myInteger;
            }
        }
        return null; // target이 없으면 null 반환
    }
}
