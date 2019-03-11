package com.zhangrui.designpatterns.factory.simplefactory;

import com.zhangrui.designpatterns.factory.MiPhone;
import com.zhangrui.designpatterns.factory.Phone;

public class TestSimple {
    public static void main(String[] args) {
        PhoneFactory factory = new PhoneFactory();
        Phone iphone = factory.produce("IPhone");
        iphone.call();
        Phone miphone = factory.produce(MiPhone.class);
        miphone.call();
    }
}
