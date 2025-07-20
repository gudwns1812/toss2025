package generic.test.ex1;

public class ContainerTest {
    public static void main(String[] args) {
        Container<String> stringContainer = new Container<>();
        System.out.println("stringContainer.isEmpty() = " + stringContainer.isEmpty());

        stringContainer.setItem("item1");
        System.out.println("stringContainer = " + stringContainer.getItem());
        System.out.println("stringContainer.isEmpty() = " + stringContainer.isEmpty());

        Container<Integer> integerContainer = new Container<>();
        integerContainer.setItem(1);
        System.out.println("integerContainer.getItem() = " + integerContainer.getItem());

    }
}
