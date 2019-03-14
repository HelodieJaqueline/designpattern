package com.zhangrui.designpatterns.factory.abstractfactory;

/**
 * @Author: ZhangRui
 * @Date: Created at 2019-03-13-21:00
 * @Description:
 * @Modified: By
 */
public class SAMSUNGStorage implements Storage {
	@Override public void store() {
		System.out.println("SAMSUNGStorage store!");
	}

	@Override public void load() {
		System.out.println("SAMSUNGStorage load!");
	}
}
