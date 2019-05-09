package com.zhangrui.designpatterns.strategy;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @Author: ZhangRui
 * @Date: Created at 2019-02-25-20:02
 * @Description:
 * @Modified: By
 */
@Service
public class TestServiceImpl implements ITestService {

	private static final String OPEN = "0";
	private static final String CANCEL = "1";
	private static Map<String, IRegister> map = new ConcurrentHashMap<String, IRegister>();

	private IRegister getRegister(String state) throws Exception {
		if (map.size() == 0) {
			map.put(OPEN, SpringBeanProxy.getBean(IRegister.class, "openRegister"));
			map.put(CANCEL, SpringBeanProxy.getBean(IRegister.class, "canCelRegister"));
		}
		return map.get(state);
	}

	@Override
	public void testStrategy(OpenRegisterParam request) throws Exception {
		getRegister(request.getState()).doRegister(request);
	}


}
