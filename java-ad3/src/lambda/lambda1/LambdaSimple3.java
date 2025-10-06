package lambda.lambda1;

import lambda.MyFunction;

public class LambdaSimple3 {
    public static void main(String[] args) {
        // 타입 생략 전
        MyFunction myFunction = (int a, int b) -> a + b;

        //MyFunction 타입을 통해 추론 가능
        MyFunction myFunction1 = (a,b) -> a + b;

    }
}
