package generic.ex5;

public class EraserBox<T> {

    public boolean instanceCheck(Object param) {
//        return param instanceof T; 오류
        return true;
    }

    public void create() {
//        return new T; 오류
    }
}
