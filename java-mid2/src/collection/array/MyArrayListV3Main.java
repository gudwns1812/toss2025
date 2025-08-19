package collection.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println("list = " + list);

        //원하는 위치에 추가
        System.out.println("==원하는 위치에 추가==");
        list.add(3, "4");
        System.out.println("list = " + list);

        System.out.println("add First");
        list.add(0,"0");
        System.out.println("list = " + list);

        Object removed1 = list.remove(4);
        System.out.println("removed1 = " + removed1);
        System.out.println("list = " + list);

        Object removed2 = list.remove(0);
        System.out.println("removed2 = " + removed2);
        System.out.println("list = " + list);
    }
}
