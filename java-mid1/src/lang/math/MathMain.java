package lang.math;

public class MathMain {
    public static void main(String[] args) {
        System.out.println("max(10,20) = " + Math.max(10, 20)); // max(10,20) = 20
        System.out.println("min(10,20) = " + Math.min(10, 20)); // max(10,20) = 20
        System.out.println("abs(10,20) = " + Math.abs(-10)); // max(10,20) = 20

        System.out.println("ceil(10.1) = " + Math.ceil(10.1)); // ceil(10.1) = 11.0
        System.out.println("floor(10.9) = " + Math.floor(10.9)); // floor(10.9) = 10.0
        System.out.println("round(10.1) = " + Math.round(10.1)); // round(10.1) = 10

        System.out.println("sqrt(4) = " + Math.sqrt(4)); // sqrt(4) = 2.0
        System.out.println("pow(2,3) = " + Math.pow(2, 3)); // pow(2,3) = 8.0
        System.out.println("random() = " + Math.random()); // random() = 0.123456789 (example output)


    }
}
