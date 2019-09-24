package com.princeli.pattern.observer.gperadvice;

import java.util.Observable;
import java.util.Observer;

/**
 * @author : princeli
 * @version 1.0
 * @className Teacher
 * @date 2019-09-24 20:12
 * @description: TODO
 */
public class Teacher implements Observer {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }


    @Override
    public void update(Observable o, Object arg) {
        GPer gper = (GPer)o;
        Question question = (Question) arg;

        System.out.println("=======================");
        System.out.println(name + "老师，你好！\n" +
                "您收到一个来自"+gper.getName()+"的提问，希望你回答，问题如下:\n"+
                question.getContent()+"\n"+
                "提问者："+question.getUserName());


    }
}
