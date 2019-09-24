package com.princeli.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @author : princeli
 * @version 1.0
 * @className GuavaEvent
 * @date 2019-09-24 21:30
 * @description: TODO
 */
public class GuavaEvent {

    @Subscribe
    public void subscribe(String str){
        System.out.println("执行subscribe方法，传入参数是："+str);

    }
}
