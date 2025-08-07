package nested.nested.anonymous;

import nested.nested.local.Printer;

public class AnonymousOuter {

    private int outInstanceValue = 3;

    public Printer process(int paramVar) {
        int localVar = 1;

        return new Printer() {
            int value = 0;

            @Override
            public void print() {
                // 자신의 멤버에 접근
                System.out.println("익명 클래스 자신의 멤버: " + value);
                // 지역 변수에 접근
                System.out.println("익명 클래스 지역 변수: " + localVar);

                // 매개변수에 접근
                System.out.println("익명 클래스 매개변수: " + paramVar);

                // 바깥 클래스의 인스턴스 멤버에 접근
                System.out.println("익명 클래스 바깥 클래스 인스턴스 멤버: " + outInstanceValue);
            }
        };
    }

    public static void main(String[] args) {
        AnonymousOuter localOuter = new AnonymousOuter();
        localOuter.process(2);
    }
}
