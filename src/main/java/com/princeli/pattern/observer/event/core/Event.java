package com.princeli.pattern.observer.event.core;

import java.lang.reflect.Method;

/**
 * @author : princeli
 * @version 1.0
 * @className Event
 * @date 2019-09-24 20:30
 * @description: 监听器
 */

public class Event {

    private Object source;

    private Object target;

    private Method callback;

    private String trigger;

    private long time;

    public Event(Object target, Method callback) {
        this.target = target;
        this.callback = callback;
    }

    public Event setSource(Object source) {
        this.source = source;
        return this;
    }

    public Event setTime(long time) {
        this.time = time;
        return this;
    }

    public Event setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    public Object getSource() {
        return source;
    }

    public Object getTarget() {
        return target;
    }

    public Method getCallback() {
        return callback;
    }

    public String getTrigger() {
        return trigger;
    }

    public long getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Event{" +
                "source=" + source +
                ", target=" + target +
                ", callback=" + callback +
                ", trigger='" + trigger + '\'' +
                ", time=" + time +
                '}';
    }
}
