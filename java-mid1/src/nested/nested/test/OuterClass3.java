package nested.nested.test;

public class OuterClass3 {
    public void myMethod() {
        class LocalClass {
            public void display() {
                System.out.println("LocalClass display method called.");
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.display();
    }
}
