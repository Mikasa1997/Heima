package com.enze.d9_serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo01 {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day09-file-io-app\\src\\obj.txt"));
        Student readObject = (Student) ois.readObject();
        System.out.println(readObject);
    }
}
