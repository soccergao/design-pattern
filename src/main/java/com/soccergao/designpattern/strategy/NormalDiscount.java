package com.soccergao.designpattern.strategy;

import org.springframework.stereotype.Component;

@Component
public class NormalDiscount implements Discount {
    @Override
    public DiscountType type() {
        return DiscountType.NORMAL;
    }

    @Override
    public double discount(double fee) {
        return fee;
    }
}
