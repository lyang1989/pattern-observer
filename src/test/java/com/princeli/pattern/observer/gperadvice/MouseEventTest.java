package com.princeli.pattern.observer.gperadvice;

import com.princeli.pattern.observer.event.mouseevent.Mouse;
import com.princeli.pattern.observer.event.mouseevent.MouseEventCallback;
import com.princeli.pattern.observer.event.mouseevent.MouseEventType;

/**
 * @author : princeli
 * @version 1.0
 * @className MouseEventTest
 * @date 2019-09-24 20:59
 * @description: TODO
 */
public class MouseEventTest {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();

        MouseEventCallback callback = new MouseEventCallback();

        mouse.addLisenter(MouseEventType.ON_CLICK, callback);
        mouse.addLisenter(MouseEventType.ON_DOUBLE_CLICK, callback);
        mouse.addLisenter(MouseEventType.ON_UP, callback);
        mouse.up();
    }
}
