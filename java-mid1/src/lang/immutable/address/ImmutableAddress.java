package lang.immutable.address;

public class ImmutableAddress {

    private final String value;

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public ImmutableAddress withValue(String newValue) {
        return new ImmutableAddress(newValue); // 새로운 인스턴스를 반환
    }

    public String getValue() {
        return value;
    }
    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
