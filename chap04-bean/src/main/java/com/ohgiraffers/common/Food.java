package com.ohgiraffers.common;

import java.sql.Date;


public class Food extends Product{
    private Date bakedDate;

    public Food(){
        super();
    }

    public Food(String name, int price, Date bakedDate) {
        super(name, price);
        this.bakedDate = bakedDate;
    }

    @Override
    public String toString() {
        return  super.toString() + "" +this.bakedDate;
    }
}
