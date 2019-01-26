package com.soccergao.designpattern;

import com.soccergao.designpattern.observer.OrderService;
import com.soccergao.designpattern.strategy.DiscountType;
import com.soccergao.designpattern.strategy.FeeCalculationService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DesignPatternApplicationTests {

    @Autowired
    OrderService orderService;
    @Autowired
    FeeCalculationService feeCalculationService;

    @Test
    public void observer() {
        orderService.saveOrder();
    }

    @Test
    public void strategy() {
        double fee = feeCalculationService.calculation(DiscountType.VIP, 100);
        Assert.assertEquals("success", fee, 90, 0);
    }
}

