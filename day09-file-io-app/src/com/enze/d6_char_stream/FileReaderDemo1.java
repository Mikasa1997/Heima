package com.enze.d6_char_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo1 {
    public static void main(String[] args) throws Exception {
        //1.创建一个字符输入流管道与源文件接通
        Reader fr = new FileReader("day09-file-io-app/src/data03.txt");

//        int code = fr.read();
//        System.out.println(code);
//        System.out.println((char) code);

        int code;
        while ((code = fr.read()) != -1){
            System.out.print((char) code);
        }
    }
}
