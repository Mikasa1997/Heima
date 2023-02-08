package com.enze.d8_char_buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

/**
 * 学会使用缓冲字符输入流，提高字符输入流的性能，新增了按行读取的方法
 */
public class BufferedReaderDemo1 {
    public static void main(String[] args) {
        try(
                Reader fr = new FileReader("day09-file-io-app/src/data.txt");
                BufferedReader bfr = new BufferedReader(fr);

                ){
            String line;
            while ((line = bfr.readLine()) != null){
                System.out.println(line);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
