package com.zhangrui.designpatterns.factory.abstractfactory;

/**
 * @Author: ZhangRui
 * @Date: Created at 2019-03-13-21:04
 * @Description:
 * @Modified: By
 */
public class Test {
	public static void main(String[] args) {
        PhoneFactory factory = new ApplePhoneFactory();
        Cpu cpu = factory.createCpu();
        Storage storage = factory.createStorge();
        cpu.calculate();
        cpu.control();
        storage.load();
        storage.store();
	}
}
