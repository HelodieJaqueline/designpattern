package com.zhangrui.designpatterns.factory.simplefactory;

import com.zhangrui.designpatterns.factory.IPhone;
import com.zhangrui.designpatterns.factory.MiPhone;
import com.zhangrui.designpatterns.factory.Phone;

public class PhoneFactory {
    public Phone produce(String name) {
        switch (name) {
            case "IPhone":
                return new IPhone();
            case "MiPhone":
                return new MiPhone();
            default:
                throw new IllegalArgumentException("No more phone can be produced!");
        }
    }

    public Phone produce(Class<? extends Phone> clazz) {
        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
