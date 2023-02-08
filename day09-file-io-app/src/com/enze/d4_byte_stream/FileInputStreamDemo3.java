package com.enze.d4_byte_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileInputStreamDemo3 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("day09-file-io-app/src/data.txt");
        byte[] buffer = new byte[3];
        int len;
        while ((len = is.read(buffer)) != -1) {
            System.out.print(new String(buffer, 0, len));
        }
    }
}
