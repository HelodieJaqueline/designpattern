package com.zhangrui.designpatterns.factory.abstractfactory;

/**
 * @Author: ZhangRui
 * @Date: Created at 2019-03-13-20:59
 * @Description:
 * @Modified: By
 */
public class SAMSUNGCpu implements Cpu{
	@Override
	public void calculate() {
		System.out.println("SAMSUNGCpu calculate!");
	}

	@Override public void control() {
		System.out.println("SAMSUNGCpu calculate!");
	}
}
