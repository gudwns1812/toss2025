package lang.immutable.change;

public class MutableObj {
    private int value;

    public MutableObj(int value) {
        this.value = value;
    }
    public void add(int addValue) {
        this.value += addValue; // 값 변경
    }
    public int getValue() {
        return value; // 현재 값 반환
    }
    public void setValue(int value) {
        this.value = value; // 값 설정
    }

    @Override
    public String toString() {
        return "MutableObj{" +
                "value=" + value +
                '}';
    }
}
