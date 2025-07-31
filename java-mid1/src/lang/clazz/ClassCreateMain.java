package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        Class<Hello> helloClass = Hello.class;
//        Class.forName("lang.clazz.Hello");
        Hello hello =(Hello) helloClass.getDeclaredConstructor().newInstance();
    }
}
