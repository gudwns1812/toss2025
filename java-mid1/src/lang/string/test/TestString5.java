package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        int index = str.indexOf(".txt");
        String fileName = str.substring(0, index);
        String extName = str.substring(index);
        System.out.println("파일 이름: " + fileName); // 파일 이름: hello
        System.out.println("확장자 이름: " + extName); // 확장자 이름: .txt
    }
}
