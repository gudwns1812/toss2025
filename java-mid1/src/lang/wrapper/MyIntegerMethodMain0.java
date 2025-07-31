package lang.wrapper;

public class MyIntegerMethodMain0 {
    public static void main(String[] args) {
        int value = 100;
        int i1 = compareTo(value, 5);
        int i2 = compareTo(value, 100);
        int i3 = compareTo(value, 200);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }

    public static int compareTo(int a, int b) {
        if (a < b) {
            return -1; // a가 b보다 작으면 -1 반환
        } else if (a > b) {
            return 1; // a가 b보다 크면 1 반환
        } else {
            return 0; // a와 b가 같으면 0 반환
        }
    }
}
