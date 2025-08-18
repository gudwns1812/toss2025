package exception.ex4;


import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args)  {
//        NetworkServiceV4 networkService = new NetworkServiceV4();
        NetworkServiceV5 networkService = new NetworkServiceV5();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String message = scanner.nextLine();
            if (message.equals("exit")) {
                break;
            }
            try {
                networkService.sendMessage(message);
            } catch (Exception e) {
                exceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");
        scanner.close();

    }

    // 공통 예외 처리 메서드
    private static void exceptionHandler(Exception e) {
        //공통 처리
        System.out.println("사용자 메세지: 죄송합니다. 알 수 없는 오류가 발생했습니다.");
        System.out.println("== 개발자용 디버깅 메시지 == ");
        e.printStackTrace(System.out);

        //필요하면 예외 별로 처리
        if (e instanceof SendExceptionV4 sendException) {
            System.out.println("[전송 오류] " + sendException.getSendData());
        }
    }
}
