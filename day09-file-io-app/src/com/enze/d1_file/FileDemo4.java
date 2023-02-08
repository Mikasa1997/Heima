package com.enze.d1_file;

import java.io.File;
import java.util.Arrays;

public class FileDemo4 {
    public static void main(String[] args) {
        File f1 = new File("C:/files");
        String[] list = f1.list();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-----------------------------");
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
        System.out.println("-----------------------------");
        File f2 = new File("D:/aaa");
        File[] files1 = f2.listFiles();
        System.out.println(files1);
        System.out.println("-----------------------------");
        File f3 = new File("C:/files/beauty.jpg");
        File[] files3 = f3.listFiles();
        System.out.println(f3.length());
        System.out.println(files3);
        System.out.println("-----------------------------");
        File f4 = new File("C:/files/ddd");
        File[] files4 = f4.listFiles();
        System.out.println(Arrays.toString(files4));
    }
}
