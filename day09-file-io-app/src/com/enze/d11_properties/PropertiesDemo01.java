package com.enze.d11_properties;

import java.io.FileWriter;
import java.util.Properties;

public class PropertiesDemo01 {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();

        properties.setProperty("admin","123456");
        properties.setProperty("anzy","1997");
        properties.setProperty("xiaogao","GAowanying");
        /**
         *      参数一：保存管道，字符输出流管道
         *      参数二：保存心得
         */
        properties.store(new FileWriter("day09-file-io-app\\src\\obj.txt"), "this is users");

    }
}
