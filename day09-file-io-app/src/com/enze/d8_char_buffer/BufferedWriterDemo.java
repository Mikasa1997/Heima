package com.enze.d8_char_buffer;

import java.io.*;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        try(
                Writer fw = new FileWriter("day09-file-io-app/src/data.txt");
                BufferedWriter bfw = new BufferedWriter(fw);
                ){
            bfw.write("你好");
            bfw.write(98);
            bfw.newLine();
            bfw.write("98");
            bfw.write('9');

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
