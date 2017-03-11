package com.chrzha.springboot.demo.spring.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by chrzha on 17-3-5.
 */
public class MyEvent extends ApplicationEvent{
    public MyEvent(Object source) {
        super(source);
    }

}
