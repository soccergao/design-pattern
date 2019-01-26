package com.soccergao.designpattern.observer;

import org.springframework.context.ApplicationEvent;

public class OrderCreateEvent extends ApplicationEvent {

    public OrderCreateEvent(Object source) {
        super(source);
    }
}
