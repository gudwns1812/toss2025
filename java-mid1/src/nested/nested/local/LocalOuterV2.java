package nested.nested.local;

public class LocalOuterV2 {

    private int outInstanceValue = 3;

    public void process(int paramVar) {
        int localVar = 1;

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                // 자신의 멤버에 접근
                System.out.println("자신의 멤버: " + value);
                // 지역 변수에 접근
                System.out.println("지역 변수: " + localVar);

                // 매개변수에 접근
                System.out.println("매개변수: " + paramVar);

                // 바깥 클래스의 인스턴스 멤버에 접근
                System.out.println("바깥 클래스 인스턴스 멤버: " + outInstanceValue);

            }
        }

        new LocalPrinter().print();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuter = new LocalOuterV2();
        localOuter.process(2);
    }
}
