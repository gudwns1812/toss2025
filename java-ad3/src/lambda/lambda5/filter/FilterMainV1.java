package lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterMainV1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //짝수만 거르기
        List<Integer> evenNumber =filterEvenNumber(numbers);
        System.out.println("evenNumber = " + evenNumber);

        //홀수만 거르기
        List<Integer> oddNumber = filterOddNumber(numbers);
        System.out.println("oddNumber = " + oddNumber);
    }

    private static List<Integer> filterOddNumber(List<Integer> numbers) {
        List<Integer> evenNumber = new ArrayList<>();
        for (Integer number : numbers) {
            boolean testResult = number % 2 == 1;
            if (testResult) {
                evenNumber.add(number);
            }
        }
        return evenNumber;
    }

    private static List<Integer> filterEvenNumber(List<Integer> numbers) {
        List<Integer> evenNumber = new ArrayList<>();
        for (Integer number : numbers) {
            boolean testResult = number % 2 == 0;
            if (testResult) {
                evenNumber.add(number);
            }
        }
        return evenNumber;
    }
}
