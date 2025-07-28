package lang.immutable.change;

public class ImmutableObj {
    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue) {
        return new ImmutableObj(this.value + addValue); // 새로운 객체 반환
    }

    public int getValue() {
        return value; // 현재 값 반환
    }

    @Override
    public String toString() {
        return "ImmutableObj{" +
                "value=" + value +
                '}';
    }
}
