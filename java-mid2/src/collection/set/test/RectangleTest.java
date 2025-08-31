package collection.set.test;

import java.util.HashSet;
import java.util.Set;

public class RectangleTest {
    public static void main(String[] args) {
        Set<Rectangle> set = new HashSet<>();
        set.add(new Rectangle(10, 20));
        set.add(new Rectangle(10, 20));
        set.add(new Rectangle(30, 40));

        System.out.println("set = " + set);
    }
}
