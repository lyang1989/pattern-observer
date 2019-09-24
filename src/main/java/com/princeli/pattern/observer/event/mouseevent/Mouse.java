package com.princeli.pattern.observer.event.mouseevent;

import com.princeli.pattern.observer.event.core.EventLisenter;

/**
 * @author : princeli
 * @version 1.0
 * @className Mouse
 * @date 2019-09-24 20:54
 * @description: TODO
 */
public class Mouse extends EventLisenter {

    public void click(){
        System.out.println("调用单击方法");
        this.trigger(MouseEventType.ON_CLICK);
    }

    public void doubleClick(){
        System.out.println("调用双击方法");
        this.trigger(MouseEventType.ON_DOUBLE_CLICK);
    }

    public void up(){
        System.out.println("调用弹起方法");
        this.trigger(MouseEventType.ON_UP);
    }

    public void down(){
        System.out.println("调用按下方法");
        this.trigger(MouseEventType.ON_DOWN);
    }

    public void move(){
        System.out.println("调用移动方法");
        this.trigger(MouseEventType.ON_MOVE);
    }

    public void wheel(){
        System.out.println("调用移动方法");
        this.trigger(MouseEventType.ON_WHEEL);
    }

    public void over(){
        System.out.println("调用结束方法");
        this.trigger(MouseEventType.ON_OVER);
    }

    public void blur(){
        System.out.println("调用失去焦点方法");
        this.trigger(MouseEventType.ON_BLUR);
    }

    public void focus(){
        System.out.println("调用获取焦点方法");
        this.trigger(MouseEventType.ON_FOCUS);
    }

}
