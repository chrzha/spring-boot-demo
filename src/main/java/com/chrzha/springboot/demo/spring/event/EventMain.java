package com.chrzha.demo.spring.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by chrzha on 17-3-5.
 */
public class EventMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(EventConfig.class);
        MyPublisher publisher = context.getBean(MyPublisher.class);
        publisher.publish();
        context.close();
    }
}
