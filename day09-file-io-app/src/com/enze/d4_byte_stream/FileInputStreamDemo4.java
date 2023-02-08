package com.enze.d4_byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileInputStreamDemo4 {
    public static void main(String[] args) throws Exception {
        File f = new File("day09-file-io-app/src/data.txt");
        InputStream is = new FileInputStream(f);
        byte[] buffer = is.readAllBytes();
        System.out.println(new String(buffer));
    }
}
