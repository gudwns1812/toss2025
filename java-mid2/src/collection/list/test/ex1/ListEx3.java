package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("n개의 정수를 입력하세요.");
        while (true) {
            int input = sc.nextInt();
            if (input == 0) {
                break;
            }
            list.add(input);
        }
        System.out.println("출력");
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        System.out.println("total = " + total);
        double average = (double) total / list.size();
        System.out.println("average = " + average);
    }
}
