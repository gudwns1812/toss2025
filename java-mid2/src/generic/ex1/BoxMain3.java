package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>(); // 생성 시 타입 지정
        integerBox.set(10);
        int i = integerBox.get();
        System.out.println("GenericBox contains: " + i);

        GenericBox<String> stringBox = new GenericBox<>(); // 생성 시 타입 지정
        stringBox.set("Hello, World!");
        String str = stringBox.get();
        System.out.println("GenericBox contains: " + str);

        //원하는 모든 타입을 사용할 수 있습니다.
        GenericBox<Double> doubleBox = new GenericBox<>(); // 생성 시 타입 지정
        doubleBox.set(3.14);
        double d = doubleBox.get();
        System.out.println("GenericBox contains: " + d);
    }
}
