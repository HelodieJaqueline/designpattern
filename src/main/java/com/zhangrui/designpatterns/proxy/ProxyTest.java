package com.zhangrui.designpatterns.proxy;

import com.zhangrui.designpatterns.proxy.jdk.Agency;

public class ProxyTest {
    public static void main(String[] args) {
        People girl = (People) new Agency().getInstance(new Girl());
        girl.buyHouse();
    }
}
