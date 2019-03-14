package com.zhangrui.designpatterns.factory.abstractfactory;

/**
 * @Author: ZhangRui
 * @Date: Created at 2019-03-13-20:57
 * @Description:
 * @Modified: By
 */
public class ApplePhoneFactory implements PhoneFactory{
	@Override
	public Cpu createCpu() {
		return new AppleCpu();
	}

	@Override
	public Storage createStorge() {
		return new AppleStorage();
	}
}
