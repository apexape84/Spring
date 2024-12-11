package com.ohgiraffers.common;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Product> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addItem(Product item) {
        items.add(item);
    }
}
