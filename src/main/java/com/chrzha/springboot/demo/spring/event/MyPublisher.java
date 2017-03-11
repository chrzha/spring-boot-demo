package com.chrzha.demo.spring.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by chrzha on 17-3-5.
 */
@Component
public class MyPublisher  {

    @Autowired
    ApplicationContext applicationContext;

    public void publish() {
        applicationContext.publishEvent(new MyEvent(this));
    }
}
