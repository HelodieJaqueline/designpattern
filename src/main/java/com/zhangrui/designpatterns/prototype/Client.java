package com.zhangrui.designpatterns.prototype;

public class Client {
    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public Prototype startClone(Prototype concretePrototype) {
        return (Prototype)concretePrototype.clone();
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("张三");
        customer.setPhone("13512345678");
        customer.setQq("11111111");
        System.out.println(customer);
        Client client = new Client(customer);
        Customer concreteCustomer = (Customer) client.startClone(customer);
        System.out.println(concreteCustomer);
        System.out.println(customer.getName() == concreteCustomer.getName());
        Dolly dolly = new Dolly();
        try {
            Dolly copy = (Dolly) dolly.clone();
            System.out.println(dolly.birthday == copy.birthday);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
