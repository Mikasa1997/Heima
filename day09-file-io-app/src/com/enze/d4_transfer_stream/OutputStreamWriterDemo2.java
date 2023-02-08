package com.enze.d4_transfer_stream;

import java.io.*;
import java.nio.charset.StandardCharsets;


public class OutputStreamWriterDemo2 {
    public static void main(String[] args){
        try (
                OutputStream os = new FileOutputStream("C:\\code\\data.txt",true);
                Writer osw = new OutputStreamWriter(os, StandardCharsets.UTF_8);
                BufferedWriter bw = new BufferedWriter(osw);
                ){
            bw.write("我爱你，中国！");
            bw.newLine();
            bw.write("abc");
            bw.newLine();
            bw.write(123);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
