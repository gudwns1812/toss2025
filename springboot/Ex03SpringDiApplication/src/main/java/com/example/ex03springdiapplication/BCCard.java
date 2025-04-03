package com.example.ex03springdiapplication;

import org.springframework.stereotype.Component;

@Component("cardBC")
public class BCCard implements ICard {
    @Override
    public void buy(String itemName) {
        System.out.println( "BCCard : " + itemName);
    }

    @Override
    public String toString() {
        return "BCCard{}";
    }
}
