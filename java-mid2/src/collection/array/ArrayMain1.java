package collection.array;

import java.util.Arrays;

public class ArrayMain1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        //index 입력: O(1)
        System.out.println("==index 입력==");
        arr[0] = 1;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));

        System.out.println("==index 변경 ==");
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));
    }
}
