package nested;

public class ShadowingMain {

    public int value = 1;

    class Inner {
        public int value = 2;

        void go() {
            int value = 3; // 지역 변수
            System.out.println("지역 변수: " + value); // 지역 변수 출력
            System.out.println("내부 클래스 변수: " + this.value); // 내부 클래스 변수 출력
            System.out.println("바깥 클래스 변수: " + ShadowingMain.this.value); // 바깥 클래스 변수 출력
        }
    }

    public static void main(String[] args) {
        ShadowingMain shadowingMain = new ShadowingMain();
        ShadowingMain.Inner inner = shadowingMain.new Inner();
        inner.go();
    }
}
