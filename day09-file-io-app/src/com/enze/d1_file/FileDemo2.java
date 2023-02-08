package com.enze.d1_file;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class FileDemo2 {
    public static void main(String[] args) {
        File f1 = new File("day09-file-io-app/src/data.txt");
//        File f1 = new File("C:\\Users\\HelloWorld\\Documents\\code\\files\\touxiang.png");
        System.out.println(f1.getAbsoluteFile());
        System.out.println("------------------------------------");
        System.out.println(f1.getPath());
        System.out.println("------------------------------------");
        System.out.println(f1.getName());
        System.out.println("------------------------------------");
        System.out.println(f1.length());
        System.out.println("------------------------------------");
        long time = f1.lastModified();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        System.out.println(sdf.format(time));
        System.out.println("------------------------------------");
        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());
        System.out.println("------------------------------------");
        File f2 = new File("c:/");
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
    }
}
