package lang.string.chaining;

public class ValueAdder {
    private int value;

    public ValueAdder add(int value) {
        this.value += value;
        return this; // 메서드 체이닝을 위해 현재 인스턴스를 반환
    }

    public int getValue() {
        return value; // 현재 value 값을 반환
    }
}
