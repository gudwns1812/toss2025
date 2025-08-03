package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        //모든 Enum 반환
        Grade[] grades = Grade.values();
        System.out.println("values = " + Arrays.toString(grades));

        for (Grade grade : grades) {
            System.out.println("name = " + grade.name() + ", ordinal = " + grade.ordinal() + ", ref = " + Integer.toHexString(System.identityHashCode(grade)));
        }

        //String -> Enum 변환
        String str = "GOLD";
        Grade grade = Grade.valueOf(str);
        System.out.println("gold = " + grade);

    }
}
