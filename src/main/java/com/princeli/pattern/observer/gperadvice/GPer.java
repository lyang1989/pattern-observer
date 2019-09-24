package com.princeli.pattern.observer.gperadvice;

import lombok.Data;

import java.util.Observable;

/**
 * @author : princeli
 * @version 1.0
 * @className GPer
 * @date 2019-09-20 20:49
 * @description: TODO
 */
@Data
public class GPer extends Observable {

    private String name ="Gper生态圈";

    private static GPer gper = null ;

    public GPer() {
    }


    public static GPer getInstance(){
        if(null == gper){
            gper = new GPer();
        }
        return gper;
    }



    public void publishQuestion(Question question){
        System.out.println(question.getUserName()+"在"+this.name+"上提交了一个问题。");
        setChanged();
        notifyObservers(question);

    }

}
