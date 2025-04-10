package com.study.stringboot.vendingmachine;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class Product {
    private String name;
    private int price;
    private LocalDate limit_date;

}
