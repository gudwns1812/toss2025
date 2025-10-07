package lambda.lambda5.mystream;

import java.util.ArrayList;
import java.util.List;

public class Ex1_Number {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = evenFilter(numbers);
        System.out.println(evenNumbers);
        List<Integer> multiNumbers = multiFilter(evenNumbers);
        System.out.println(multiNumbers);
    }

    private static List<Integer> evenFilter(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                result.add(number);
            }
        }
        return result;
    }

    private static List<Integer> multiFilter(List<Integer> evenNumbers) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : evenNumbers) {
            result.add(number * 2);
        }
        return result;
    }
}
