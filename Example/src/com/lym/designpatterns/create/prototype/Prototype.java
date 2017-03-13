package com.lym.designpatterns.create.prototype;

import java.io.*;
import java.util.Objects;

/**
 * Created by lym on 2017/3/13.
 */
public class Prototype implements Cloneable,Serializable {

    private static final long serialVersionUID = 3998779939289870193L;

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //浅拷贝
    public Object clone() throws CloneNotSupportedException{
        Prototype proto = (Prototype)super.clone();
        return proto;
    }

    //深拷贝
    public Object deepClone() throws IOException,ClassNotFoundException{

        //将当前对象写入二进制流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }
}

