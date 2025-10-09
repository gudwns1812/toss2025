package lambda.lambda6;

public class OuterMain {

    private String message = "외부 클래스";

    public void execute() {
        Runnable runnable = new Runnable() {
            private String message = "익명 클래스";

            @Override
            public void run() {
                //익명 클래스에서의 this는 익명 클래스의 인스턴스를 가리킴
                System.out.println("[익명 클래스] this: " + this);
                System.out.println("[익명 클래스] this.class: " + this.getClass());
                System.out.println("[익명 클래스] this.message: " + this.message);

            }
        };

        //2. 람다 예시
        Runnable lambda = () -> {
            System.out.println("[람다] this: " + this);
            System.out.println("[람다] this.class: " + this.getClass());
            System.out.println("[람다] this.message: " + this.message);
        };

        runnable.run();
        System.out.println("----------------------");
        lambda.run();

    }


    public static void main(String[] args) {
        OuterMain outerMain = new OuterMain();
        System.out.println("[외부 클래스]" + outerMain);
        outerMain.execute();
    }
}
