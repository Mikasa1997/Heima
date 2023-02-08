package com.enze.d11_properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo02 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        System.out.println(properties);

        properties.load(new FileReader("day09-file-io-app\\src\\obj.txt"));
        String rs = properties.getProperty("admin");
        System.out.println(rs);
        System.out.println(properties);

        Set<String> set = properties.stringPropertyNames();
        System.out.println(set);
    }
}
