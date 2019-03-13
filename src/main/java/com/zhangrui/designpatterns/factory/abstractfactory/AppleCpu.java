package com.zhangrui.designpatterns.factory.abstractfactory;

/**
 * @Author: ZhangRui
 * @Date: Created at 2019-03-13-20:59
 * @Description:
 * @Modified: By
 */
public class AppleCpu implements Cpu{
	@Override
	public void calculate() {
		System.out.println("AppleCpu calculate!");
	}
}
