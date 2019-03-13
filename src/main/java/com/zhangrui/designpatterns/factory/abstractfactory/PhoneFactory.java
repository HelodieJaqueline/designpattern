package com.zhangrui.designpatterns.factory.abstractfactory;

/**
 * @Author: ZhangRui
 * @Date: Created at 2019-03-13-20:51
 * @Description:
 * @Modified: By
 */
public abstract class PhoneFactory {
	abstract Cpu createCpu();

	abstract Storage createStorge();
}
