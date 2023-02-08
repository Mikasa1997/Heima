package com.enze.d12_commons_io;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test {
    public static void main(String[] args) throws Exception{
        long startTime = System.currentTimeMillis();
        IOUtils.copy(new FileInputStream("C:\\Users\\HelloWorld\\Documents\\code\\Heima_Java_Project\\test.mp4"),
                new FileOutputStream("C:\\Users\\HelloWorld\\Documents\\code\\Heima_Java_Project\\test2.mp4"));
        long endTime = System.currentTimeMillis();
        System.out.println("用时：" + (endTime - startTime) / 1000.0 + "s");
    }
}
