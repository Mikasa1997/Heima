package com.enze.d6_char_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo2 {
    public static void main(String[] args) throws Exception {
        Reader fr = new FileReader("day09-file-io-app/src/data03.txt");
        char[] buffer = new char[1024];
        int len;
        while ((len = fr.read(buffer)) != -1) {
            for (char c : buffer) {
                System.out.print((char) c);
            }
        }
    }
}
