package exception.ex2;


import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) throws NetworkClientExceptionV2 {
//        NetworkServiceV1_1 networkService = new NetworkServiceV1_1();
//        NetworkServiceV1_2 networkService = new NetworkServiceV1_2();
//        NetworkServiceV2_2 networkService = new NetworkServiceV2_2();
//        NetworkServiceV2_4 networkService = new NetworkServiceV2_4();
        NetworkServiceV2_5 networkService = new NetworkServiceV2_5();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String message = scanner.nextLine();
            if (message.equals("exit")) {
                break;
            }
            networkService.sendMessage(message);
            System.out.println();
        }
        System.out.println("프로그램 종료");
        scanner.close();

    }
}
