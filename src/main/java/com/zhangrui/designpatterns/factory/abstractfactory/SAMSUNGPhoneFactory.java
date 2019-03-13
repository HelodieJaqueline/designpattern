package com.zhangrui.designpatterns.factory.abstractfactory;

/**
 * @Author: ZhangRui
 * @Date: Created at 2019-03-13-20:57
 * @Description:
 * @Modified: By
 */
public class SAMSUNGPhoneFactory implements PhoneFactory{
	@Override
	public Cpu createCpu() {
		return new SAMSUNGCpu();
	}

	@Override
	public Storage createStorge() {
		return new SAMSUNGStorage();
	}
}
