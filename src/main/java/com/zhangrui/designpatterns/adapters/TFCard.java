package com.zhangrui.designpatterns.adapters;

public interface TFCard {
    String readTF();
    int writeTF(String msg);
}
