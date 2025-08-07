package nested.nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {

    private int outInstanceValue = 3;


    public Printer process(int paramVar) {
        int localVar = 1; // 지역 변수는 스택 프레임이 종료되는 순간 사라진다.

        class LocalPrinter implements Printer {
            int value = 0; // 인스턴스는 지역 변수보다 오래 살아남는다.

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
        LocalPrinter printer = new LocalPrinter();
        // 만약 localVar의 값을 변경한다면
        //localVar = 20;
        return printer; // Printer 인스턴스만 반환
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuter = new LocalOuterV4();
        Printer process = localOuter.process(2);
        //printer.print()를 나중에 실행한다. process()의 스택 프레임이 사라진 이후에 실행
        process.print();

        //추가
        String a = "aBcDe";
        
        System.out.println("필드 확인");
        Field[] fields = process.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
