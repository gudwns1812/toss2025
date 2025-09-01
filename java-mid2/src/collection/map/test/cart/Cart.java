package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    Map<Product, Integer> cart = new HashMap<>();

    public void add(Product product, int count) {
        cart.put(product, cart.getOrDefault(product, 0) + count);
    }

    public void printAll() {
        System.out.println("== 모든 상품 출력 ==");
        for (Map.Entry<Product, Integer> productIntegerEntry : cart.entrySet()) {
            System.out.println("상품: " + productIntegerEntry.getKey() + ", 수량: " + productIntegerEntry.getValue());
        }
    }

    public void minus(Product product, int count) {
        cart.put(product, cart.getOrDefault(product, 0) - count);
        if (cart.get(product) <= 0) {
            cart.remove(product);
        }
    }
}
