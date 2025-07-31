package lang.wrapper;

public class MyIntegerNullMain0 {

    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1,2,3};
        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 2));
        System.out.println(findValue(intArr, 100));
    }

    private static int findValue(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return arr[i]; // target을 찾으면 해당 인덱스 반환
            }
        }
        return -1; // target이 없으면 -1 반환
    }
}
