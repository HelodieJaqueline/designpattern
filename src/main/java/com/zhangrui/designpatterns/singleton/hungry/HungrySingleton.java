package com.zhangrui.designpatterns.singleton.hungry;


/**
 * 饿汉模式，线程安全，但是没有延时加载效果
 */
public class HungrySingleton {
    private HungrySingleton() {
    }

    private static HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return instance;
    }
}
