//final 키워드
// 1. final 변수 - 상속형 변수를 선언할 때
// 2. final class : 상속 불가
// 3. final 메소드 : 오버라이드 불가

class FinalClass{
    String name = "파이널 클래스";
    int age; // 0으로 초기화 됨
    final int price = 1000;
}

public class ex33 {
    public static void main(String[] args) {
        int i = 30;
        final int j = 20; // 상수로 지정됨
    }
}
