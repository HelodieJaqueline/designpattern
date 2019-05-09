package com.zhangrui.designpatterns.observer;

public class GPer {
    private final String name = "GPer生态圈";
    private Question question;

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getName() {
        return name;
    }
}
