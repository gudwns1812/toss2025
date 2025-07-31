package lang.wrapper;

public class WrapperVSPrimitive {
    public static void main(String[] args) {
        int iterations = 1_000_000_000;
        long startTime , endTime;

        // Using primitive type
        long primitiveSum = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            primitiveSum += i; // Primitive type addition
        }

        endTime = System.currentTimeMillis();
        System.out.println("primitiveSum = " + primitiveSum);
        System.out.println("Primitive type time: " + (endTime - startTime) + " ms");

        // Using wrapper class
        Long wrapperSum = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            wrapperSum += i; // Wrapper class addition
        }
        endTime = System.currentTimeMillis();
        System.out.println("wrapperSum = " + wrapperSum);
        System.out.println("Wrapper class time: " + (endTime - startTime) + " ms");
    }
}
