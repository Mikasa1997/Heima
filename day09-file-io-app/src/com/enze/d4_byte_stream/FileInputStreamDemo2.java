package com.enze.d4_byte_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("day09-file-io-app/src/data.txt");
        byte[] bottle = new byte[3];
        int readNum = is.read(bottle);
        System.out.println("读取了" + readNum + "个字节");
        for (byte b : bottle) {
            System.out.print(b);
        }
        System.out.println();
        String rs = new String(bottle);
        System.out.println(rs);

        int readNum2 = is.read(bottle);
        System.out.println("读取了" + readNum2 + "个字节");
        for (byte b : bottle) {
            System.out.print(b);
        }
        System.out.println();
        String rs2 = new String(bottle);
        System.out.println(rs2);

        int readNum3 = is.read(bottle);
        System.out.println("读取了" + readNum3 + "个字节");
        for (byte b : bottle) {
            System.out.print(b);
        }
        System.out.println();
        String rs3 = new String(bottle);
        System.out.println(rs3);
    }
}
