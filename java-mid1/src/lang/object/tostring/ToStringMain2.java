package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {

        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍이1", 2);
        Dog dog2 = new Dog("멍멍이2", 5);

        System.out.println("car = " + car);
        System.out.println("dog1 = " + dog1);
        System.out.println("dog2 = " + dog2);

        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        String hexString = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("i = " + hexString);
    }
}
