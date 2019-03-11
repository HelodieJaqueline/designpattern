package com.zhangrui.designpatterns.factory.factorymethod;

import com.zhangrui.designpatterns.factory.MiPhone;
import com.zhangrui.designpatterns.factory.Phone;

public class MiPhoneFactory implements IFactory {
    @Override
    public Phone produce() {
        return new MiPhone();
    }
}
