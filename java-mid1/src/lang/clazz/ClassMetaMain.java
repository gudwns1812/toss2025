package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = String.class; // 1. 클래스에서 조회
        Class clazz1 = new String().getClass(); // 2. 인스턴스에서 조회
        Class<?> clazz2 = Class.forName("java.lang.String"); // 3. 문자열로 조회

        Field[] declaredFields = clazz.getDeclaredFields();// 클래스의 필드 조회
        for (Field declaredField : declaredFields) {
            System.out.println("declaredField = " + declaredField.getType() + " " + declaredField.getName());
        }
        //모든 메서드 출력
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("declaredMethod = " + declaredMethod.getReturnType() + " " + declaredMethod.getName());
        }
        Class superclass = clazz.getSuperclass();
        System.out.println("superclass = " + superclass.getName()); // java.lang.Object

        Class[] interfaces = clazz.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println("interface = " + anInterface.getName());
        }
    }
}
