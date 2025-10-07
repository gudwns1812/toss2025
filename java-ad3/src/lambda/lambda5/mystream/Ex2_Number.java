package lambda.lambda5.mystream;

import lambda.lambda5.filter.GenericFilter;
import lambda.lambda5.filter.IntegerFilter;
import lambda.lambda5.map.GenericMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Ex2_Number {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("lambda(numbers) = " + lambda(numbers));
    }

   private static List<Integer> lambda(List<Integer> list) {
       List<Integer> filtered = GenericFilter.filter(list, x -> x % 2 == 0);
       return GenericMapper.map(filtered, x -> x * 2);
   }
}
