package com.zhangrui.designpatterns.proxy.myproxy;

import com.zhangrui.designpatterns.proxy.Girl;
import com.zhangrui.designpatterns.proxy.People;

public class MyProxyTest {

    public static void main(String[] args) {
        try {

            //JDK动态代理的实现原理
            People obj = (People) new MyAgency().getInstance(new Girl());
            System.out.println(obj.getClass());
            obj.buyHouse();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
