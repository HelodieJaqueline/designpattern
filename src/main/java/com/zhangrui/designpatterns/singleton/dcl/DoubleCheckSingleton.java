package com.zhangrui.designpatterns.singleton.dcl;

/**
 * 双重锁检验，考虑到编译器会重排序，所以单例需要用volatile修饰
 */
public class DoubleCheckSingleton {
    private static volatile DoubleCheckSingleton instance = null;


    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (null == instance) {
            synchronized (DoubleCheckSingleton.class) {
                if (null == instance) {
                    //这一步可以分为三步,2和3可能被重排序，在单线程下不会出现问题
                    //1 memory = allocate()    --分配内存空间
                    //2 ctorInstance(memory)   --初始化对象
                    //3 instance = memory      --设置instance指向刚才分配的内存地址
                    //但是在多线程情况下，发生了重排序，另一个线程在走到14行时会访问到一个没有被初始化的对象
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
