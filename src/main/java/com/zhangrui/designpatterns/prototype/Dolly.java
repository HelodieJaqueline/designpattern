package com.zhangrui.designpatterns.prototype;

import java.io.*;
import java.util.Date;

public class Dolly extends Sheep implements Cloneable, Serializable {
    public Dolly() {
        birthday = new Date();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Dolly copy = (Dolly) ois.readObject();
            copy.birthday = new Date();
            return copy;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
