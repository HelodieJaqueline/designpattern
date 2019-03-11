package com.zhangrui.designpatterns.factory.factorymethod;

import com.zhangrui.designpatterns.factory.IPhone;
import com.zhangrui.designpatterns.factory.Phone;

public class IPhoneFactory implements IFactory {
    @Override
    public Phone produce() {
        return new IPhone();
    }
}
