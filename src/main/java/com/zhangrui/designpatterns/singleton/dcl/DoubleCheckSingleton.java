package com.zhangrui.designpatterns.singleton.dcl;

/**
 * 双重锁检验，考虑到编译器会重排序，所以单例需要用volatile修饰
 */
public class DoubleCheckSingleton {
    private static DoubleCheckSingleton instance = null;


    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (null == instance) {
            synchronized (DoubleCheckSingleton.class) {
                if (null == instance) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
