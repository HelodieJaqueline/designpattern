package com.zhangrui.designpatterns.singleton.staticinnerclass;

public class InnerClassSingleton {

    private static class Holder {
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }

    private InnerClassSingleton() {
    }

    public static InnerClassSingleton getInstance() {
        return Holder.instance;
    }


}
