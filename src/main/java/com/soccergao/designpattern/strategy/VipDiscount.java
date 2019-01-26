package com.soccergao.designpattern.strategy;

import org.springframework.stereotype.Component;

@Component
public class VipDiscount implements Discount {
    @Override
    public DiscountType type() {
        return DiscountType.VIP;
    }

    @Override
    public double discount(double fee) {
        return fee * 0.9;
    }
}
