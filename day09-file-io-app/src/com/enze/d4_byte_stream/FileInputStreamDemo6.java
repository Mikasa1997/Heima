package com.enze.d4_byte_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputStreamDemo6 {
    public static void main(String[] args) {
        try (
                InputStream is = new FileInputStream("C:\\Users\\HelloWorld\\Documents\\code\\Heima_Java_Project" +
                        "\\20230201_01143.mp4");
                OutputStream os = new FileOutputStream("C:\\Users\\HelloWorld\\Documents\\code\\Heima_Java_Project" +
                        "\\videoCopyOutput\\new.mp4");
                ){
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
            try {
                System.out.println(10/0);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("复制完成了！");
        } catch (Exception e) {
            System.out.println("没找到");
        }
    }
}
