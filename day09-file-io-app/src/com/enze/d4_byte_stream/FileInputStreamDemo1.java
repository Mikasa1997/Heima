package com.enze.d4_byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        //1.创建一个文件字节输入流管道与源文件接通
        InputStream is = new FileInputStream("day09-file-io-app\\src\\data.txt");
        //2.读取一个字节，返回
//        int b1 = is.read();
//        System.out.println((char) b1);
        int b;
        while ((b = is.read()) != -1){
            System.out.print((char) b);
        }

    }
}
