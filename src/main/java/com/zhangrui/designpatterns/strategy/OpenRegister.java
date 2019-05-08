package com.zhangrui.designpatterns.strategy;

import com.zhangrui.domain.request.OpenRegisterParam;
import org.springframework.stereotype.Service;

/**
 * @Author: ZhangRui
 * @Date: Created at 2019-02-25-20:28
 * @Description:
 * @Modified: By
 */
@Service
public class OpenRegister implements IRegister {

	@Override
	public void doRegister(OpenRegisterParam request) {
		System.out.println("Do Open!");
	}
}
