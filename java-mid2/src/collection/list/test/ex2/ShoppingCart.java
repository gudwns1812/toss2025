package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<Item> items = new ArrayList<>();
    private int totalPrice;

    public void addItem(Item item) {
        items.add(item);
        totalPrice += item.getTotalPrice();
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (Item item : items) {
            System.out.println("상품명:" + item.getName() + ", 합계:" + item.getTotalPrice() + "원");
        }
        System.out.println("전체 가격 합: " + totalPrice + "원");
    }
}
