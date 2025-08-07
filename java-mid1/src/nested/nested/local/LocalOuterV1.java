package nested.nested.local;

public class LocalOuterV1 {

    private int outInstanceValue = 3;

    public void process(int paramVar) {
        int localVar = 1;

        class LocalPrinter {
            int value = 0;

            public void printData() {
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

        LocalPrinter localPrinter = new LocalPrinter();
        localPrinter.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuter = new LocalOuterV1();
        localOuter.process(2);
    }
}
