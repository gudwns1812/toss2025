package lang.wrapper;

public class MyInteger {
    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int target) {
        if (this.value < target) {
            return -1; // this.value가 target보다 작으면 -1 반환
        } else if (this.value > target) {
            return 1; // this.value가 target보다 크면 1 반환
        } else {
            return 0; // this.value와 target이 같으면 0 반환
        }
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
