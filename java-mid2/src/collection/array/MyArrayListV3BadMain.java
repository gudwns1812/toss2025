package collection.array;

public class MyArrayListV3BadMain {
    public static void main(String[] args) {
        MyArrayListV3 numberList = new MyArrayListV3();

        //숫자만 입력 하기 기대
        numberList.add(1);
        numberList.add(2);
        numberList.add("3"); //문자열 입력, 타입 안전성 문제 발생
        System.out.println(numberList);

        // Object를 반환하므로 다운캐스팅 필수
        Integer num1 = (Integer) numberList.get(0);
        Integer num2 = (Integer) numberList.get(1);

        //ClassCastException 발생
        Integer num3 = (Integer) numberList.get(2); //문자열을 Integer로 다운캐스팅 시 예외 발생
    }
}
