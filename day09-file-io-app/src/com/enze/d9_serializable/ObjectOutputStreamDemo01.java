package com.enze.d9_serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo01 {
    public static void main(String[] args) throws Exception {
        Student s = new Student("陈磊", "chenlei", "1314520", 21);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day09-file-io-app\\src\\obj.txt"));
        oos.writeObject(s);
        oos.close();
        System.out.println("序列化完成");

    }
}
