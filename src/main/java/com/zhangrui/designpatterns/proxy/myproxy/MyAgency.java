package com.zhangrui.designpatterns.proxy.myproxy;

import java.lang.reflect.Method;

public class MyAgency implements MyInvocationHandler {
    private Object target;
    public Object getInstance(Object target) throws Exception{
        this.target = target;
        Class<?> clazz = target.getClass();
        return MyProxy.newProxyInstance(new MyClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target,args);
        after();
        return obj;
    }

    private void after() {
        System.out.println("合同已签，收取中介费！");
    }

    private void before() {
        System.out.println("中介确定需求等一系列操作……");
    }
}
