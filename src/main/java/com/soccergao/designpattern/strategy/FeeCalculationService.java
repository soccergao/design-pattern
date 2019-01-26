package com.soccergao.designpattern.strategy;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class FeeCalculationService {

    private Map<DiscountType, Discount> map = new ConcurrentHashMap<>();

    public FeeCalculationService(List<Discount> discounts) {
        discounts.forEach(discount -> map.put(discount.type(), discount));
    }

    public double calculation(DiscountType type, double fee) {
        return map
                .get(type)
                .discount(fee);
    }

}
