package lang.wrapper;

public class WrapperUtilsMain {

    public static void main(String[] args) {
        Integer i1 = 10;
        Integer integer = Integer.valueOf("10");
        int i = Integer.parseInt("10");//문자열 전용 기본형 반환

        int i2 = i1.compareTo(integer);
    }
}
