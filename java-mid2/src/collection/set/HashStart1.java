package collection.set;

import java.util.Arrays;

public class HashStart1 {
    public static void main(String[] args) {
        Integer[] inputArray = new Integer[4];
        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[2] = 3;
        inputArray[3] = 4;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 3;
        for (Integer integer : inputArray) {
            if (integer == searchValue) {
                System.out.println("Found: " + searchValue);
            }
        }
    }

}
