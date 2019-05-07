package com.zhangrui.designpatterns.proxy;

public class Girl implements People{

    @Override
    public void buyHouse() {
        System.out.println("我是女孩子，要买一个漂亮的房子");
    }
}
