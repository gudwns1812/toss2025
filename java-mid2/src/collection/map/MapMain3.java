package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("studentA", 90);
        System.out.println(map);

        // 학생이 없는 경우에만 추가1
        if (!map.containsKey("studentB")) {
            map.put("studentA", 80);
        }
        System.out.println(map);

        // 학생이 없는 경우에만 추가2
        map.putIfAbsent("studentB", 100);
        System.out.println(map);
    }
}
