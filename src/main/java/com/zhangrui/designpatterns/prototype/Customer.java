package com.zhangrui.designpatterns.prototype;

import lombok.Data;
import lombok.NoArgsConstructor;

public class Customer implements Prototype{
    private String name;

    private String phone;

    private String qq;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    /**
     * 浅克隆
     * @return
     */
    @Override
    public Customer clone() {
        Customer customer = new Customer();
        customer.setName(this.name);
        customer.setPhone(this.phone);
        customer.setQq(this.qq);
        return customer;
    }
}
