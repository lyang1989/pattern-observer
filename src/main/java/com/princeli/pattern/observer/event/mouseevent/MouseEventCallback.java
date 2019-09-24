package com.princeli.pattern.observer.event.mouseevent;

import com.princeli.pattern.observer.event.core.Event;

/**
 * @author : princeli
 * @version 1.0
 * @className MouseEventCallback
 * @date 2019-09-24 20:58
 * @description: TODO
 */
public class MouseEventCallback {

    public void onClick(Event e){
        System.out.println("触发鼠标单击事件"+ e);
    }

    public void onDoubleClick(Event e){
        System.out.println("触发鼠标双击事件" + e);
    }

    public void onUp(Event e){
        System.out.println("触发鼠标弹起事件" + e);
    }

}
