package com.enze.d1_file;

import java.io.File;

/*
        目标：学会创建File对象定位操作系统的文件（文件  文件夹的）
*/
public class FileDemo {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\HelloWorld\\Documents\\code\\files\\beauty.jpg");
        long length1 = f1.length();
        System.out.println(length1);
        System.out.println("-------------------------------");
        File f2 = new File("day09-file-io-app/src/data.txt");
        System.out.println(f2.length());
        System.out.println("-------------------------------");
        File f3 = new File("C:\\Users\\HelloWorld\\Documents\\code\\files");
        System.out.println(f3.exists());

    }
}
