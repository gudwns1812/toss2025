package annotation.basic;

import java.util.Arrays;

public class ElementData1Main {
    public static void main(String[] args) {
        Class<ElementData1> aClass = ElementData1.class;
        AnnoElement annotation = aClass.getAnnotation(AnnoElement.class);

        String value = annotation.value();
        System.out.println(value);

        int count = annotation.count();
        System.out.println(count);

        String[] tags = annotation.tags();
        System.out.println("tags = " + Arrays.toString(tags));
    }
}
