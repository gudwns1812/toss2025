package com.jpabook.jpashop.repository.order.query;

import com.jpabook.jpashop.domain.Address;
import com.jpabook.jpashop.domain.Order;
import com.jpabook.jpashop.domain.OrderStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrderFlatDto {
    private Long orderId;
    private String name;
    private OrderStatus orderStatus;
    private Address address;
    private LocalDateTime orderDate;

    private String itemName;
    private int orderPrice;
    private int count;

    public OrderFlatDto(Long orderId, String name, OrderStatus orderStatus, Address address, LocalDateTime orderDate, String itemName, int orderPrice, int count) {
        this.orderId = orderId;
        this.name = name;
        this.orderStatus = orderStatus;
        this.address = address;
        this.orderDate = orderDate;
        this.itemName = itemName;
        this.orderPrice = orderPrice;
        this.count = count;
    }
}
