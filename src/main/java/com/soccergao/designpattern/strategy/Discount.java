package com.soccergao.designpattern.strategy;

public interface Discount {
    DiscountType type();
    double discount(double fee);
}
