package com.soccergao.designpattern.observer;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SmsListener implements ApplicationListener<OrderCreateEvent> {
    @Override
    public void onApplicationEvent(OrderCreateEvent orderCreateEvent) {
        System.out.println("短信通知");
    }
}
