package com.soccergao.designpattern.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    ApplicationContext applicationContext;

    public void saveOrder() {
        System.out.println("保存订单");
        OrderCreateEvent orderCreateEvent = new OrderCreateEvent(new Object());
        applicationContext.publishEvent(orderCreateEvent);
    }

}
