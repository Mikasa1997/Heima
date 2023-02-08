package com.enze.d6_char_stream;

import java.io.*;

public class FileReaderDemo3 {
    public static void main(String[] args) {
        try(
                InputStream is = new FileInputStream("day09-file-io-app\\src\\data.txt");
                InputStream bis = new BufferedInputStream(is);

                OutputStream os = new FileOutputStream("day09-file-io-app\\src\\data04.txt");
                OutputStream bos = new BufferedOutputStream(os);
        ){
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            System.out.println("复制完成了！");
        } catch (Exception e) {
            System.out.println("没找到");
        }
    }
}