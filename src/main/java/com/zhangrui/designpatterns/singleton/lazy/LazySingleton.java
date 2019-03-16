package com.zhangrui.designpatterns.singleton.lazy;

/**
 * 懒汉模式，线程安全，延时加载，但是效率低
 */
public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
