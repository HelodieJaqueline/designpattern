package com.zhangrui.designpatterns.factory.factorymethod;

import com.zhangrui.designpatterns.factory.Phone;

public class TestMethod {
    public static void main(String[] args) {
        IFactory factory = new IPhoneFactory();
        Phone iphone = factory.produce();
        IFactory factory1 = new MiPhoneFactory();
        Phone mihone = factory1.produce();
        iphone.call();
        mihone.call();
    }
}
