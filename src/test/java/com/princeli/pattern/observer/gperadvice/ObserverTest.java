package com.princeli.pattern.observer.gperadvice;

/**
 * @author : princeli
 * @version 1.0
 * @className ObserverTest
 * @date 2019-09-24 20:18
 * @description: TODO
 */
public class ObserverTest {
    public static void main(String[] args) {
        GPer gper = GPer.getInstance();
        Teacher tom = new Teacher("tom");
        Teacher mic = new Teacher("mic");

        Question question =new Question();
        question.setUserName("小米");
        question.setContent("今年小米9好吗？");
        gper.addObserver(mic);

        gper.publishQuestion(question);

    }
}
