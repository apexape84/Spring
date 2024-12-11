package com.ohgiraffers.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Drink extends Product{
    private int capacity;

    public Drink() {
        super();
    }

    public Drink(String name, int price, int capacity) {
        super(name, price);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return  super.toString() + "" +this.capacity;
    }
}
