package com.enze.d7_test_demo;

import java.io.*;

public class Compare {
    public static final String FILE_PATH = "C:\\Users\\HelloWorld\\Documents\\code\\Heima_Java_Project\\test.mp4";
    public static final String COPY_PATH = "C:\\Users\\HelloWorld\\Documents\\code\\Heima_Java_Project\\test\\";

    public static void main(String[] args) {
        copy1();
        //copy2();
        copy3();
    }

    private static void copy3() {
        long startTime = System.currentTimeMillis();
        try (
                InputStream is = new FileInputStream(FILE_PATH);
                InputStream bis = new BufferedInputStream(is);
                OutputStream os = new FileOutputStream(COPY_PATH + "new3.mp4");
                OutputStream bos = new BufferedOutputStream(os);
        ) {
            byte[] buffer = new byte[1024 * 8];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("方式三 高级缓冲数组方式用时：" + (endTime - startTime) / 1000.0 + "s");
    }

    /**
     * 方式二：使用高级缓冲流，一个字节一个字节的读
     */
    private static void copy2() {
        long startTime = System.currentTimeMillis();
        try (
                InputStream is = new FileInputStream(FILE_PATH);
                InputStream bis = new BufferedInputStream(is);
                OutputStream os = new FileOutputStream(COPY_PATH + "new2.mp4");
                OutputStream bos = new BufferedOutputStream(os);
        ) {
            int read;
            while ((read = bis.read()) != -1) {
                bos.write(read);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("方式二 高级缓冲字节流方式用时：" + (endTime - startTime) / 1000.0 + "s");
    }

    /**
     * 方式一：使用字节输入流数组
     */
    private static void copy1() {
        long startTime = System.currentTimeMillis();
        try (
                InputStream is = new FileInputStream(FILE_PATH);
                OutputStream os = new FileOutputStream(COPY_PATH + "new1.mp4");
        ) {
            byte[] buffer = new byte[1024 * 8];
            int len;
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("方式一 低级字节流数组方式用时：" + (endTime - startTime) / 1000.0 + "s");
    }
}
