package com.zhangrui.designpatterns.factory.abstractfactory;

/**
 * @Author: ZhangRui
 * @Date: Created at 2019-03-13-20:51
 * @Description:
 * @Modified: By
 */
public interface PhoneFactory {
	Cpu createCpu();

	Storage createStorge();
}
