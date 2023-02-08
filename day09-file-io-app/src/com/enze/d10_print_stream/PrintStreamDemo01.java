package com.enze.d10_print_stream;

import java.io.*;

public class PrintStreamDemo01 {
    public static void main(String[] args) throws Exception {
        OutputStream os = new FileOutputStream("day09-file-io-app\\src\\obj.txt",true);
        Writer fw = new OutputStreamWriter(os,"GBK");
        PrintWriter ps = new PrintWriter(fw);

        ps.println("这是另一条数据！");
        ps.close();
    }
}
