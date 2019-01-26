package com.soccergao.designpattern.strategy;

import org.springframework.stereotype.Component;

@Component
public class SVipDiscount implements Discount {
    @Override
    public DiscountType type() {
        return DiscountType.SVIP;
    }

    @Override
    public double discount(double fee) {
        return fee * 0.8;
    }
}
