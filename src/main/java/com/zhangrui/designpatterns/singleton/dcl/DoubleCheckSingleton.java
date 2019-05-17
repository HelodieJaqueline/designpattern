package com.zhangrui.designpatterns.singleton.dcl;

/**
 * 双重锁检验单例
 */
public class DoubleCheckSingleton {

    /**
     * 考虑到编译器会重排序，所以单例需要用volatile修饰
     */
    private static volatile DoubleCheckSingleton instance = null;


    private DoubleCheckSingleton() {
        //防止反射攻击单例
        if (null != instance) {
            throw new RuntimeException("单例模式已被创建！");
        }
    }

    /**
     * 锁代码块而不是直接锁方法，提高性能
     * 第一重非空校验是防止多个线程争抢同一把锁，如果instance不为空可以直接返回，不用进入synchronized块里面了
     * 第二重锁是防止在第一次调用getInstance()方法的时候，线程A执行到①时没有加锁，
     * 这时候线程B又进来了并且抢占到锁，执行到synchronized里面了，此时线程A处于阻塞状态。等第线程B创建完对象释放锁，线程A会再创建一次！
     * @return
     */
    public static DoubleCheckSingleton getInstance() {
        if (null == instance) { //①
            synchronized (DoubleCheckSingleton.class) {
                if (null == instance) { // ②
                    //这一步可以分为三步,2和3可能被重排序，在单线程下不会出现问题
                    //1 memory = allocate()    --分配内存空间
                    //2 ctorInstance(memory)   --初始化对象
                    //3 instance = memory      --设置instance指向刚才分配的内存地址
                    //但是在多线程情况下，发生了重排序，另一个线程在走到①时会访问到一个没有被初始化的对象
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
