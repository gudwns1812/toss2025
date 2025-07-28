package lang.immutable.test;

public class MyDate {
    private final int year;
    private final int month;
    private final int day;
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public MyDate withYear(int year) {
        return new MyDate(year, this.month, this.day); // 새로운 객체 반환
    }
    public MyDate withMonth(int month) {
        return new MyDate(this.year, month, this.day); // 새로운 객체 반환
    }
    public MyDate withDay(int day) {
        return new MyDate(this.year, this.month, day); // 새로운 객체 반환
    }
    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
