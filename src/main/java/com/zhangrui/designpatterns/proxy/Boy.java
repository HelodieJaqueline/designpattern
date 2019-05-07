package com.zhangrui.designpatterns.proxy;

public class Boy implements People{
    @Override
    public void buyHouse() {
        System.out.println("我是男孩子，要买一个宽大的房子！");
    }
}
