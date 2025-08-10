import java.util.*;

public class Algo {
    public static void main(String[] args) {
        String[] phone_book = {"12", "123", "1235", "567", "88"};
        System.out.println(solution(phone_book)); // false
    }
    public static boolean solution(String[] phone_book) {
        Set<String> set = new HashSet<>(Arrays.asList(phone_book));
        for (String phone : phone_book) {
            for (int i = 1; i < phone.length(); i++) {
                if (set.contains(phone.substring(0, i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
