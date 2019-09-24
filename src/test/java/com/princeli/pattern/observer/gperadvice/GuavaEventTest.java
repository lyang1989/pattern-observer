package com.princeli.pattern.observer.gperadvice;

import com.google.common.eventbus.EventBus;
import com.princeli.pattern.observer.guava.GuavaEvent;

/**
 * @author : princeli
 * @version 1.0
 * @className GuavaEventTest
 * @date 2019-09-24 21:32
 * @description: TODO
 */
public class GuavaEventTest {
    public static void main(String[] args) {

        //消息总线
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(guavaEvent);
        eventBus.post("Tom");



    }
}
