package com.enze.d4_transfer_stream;

import java.io.*;

public class InputStreamReaderDemo1 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("C:\\code\\data.txt");
        Reader isr = new InputStreamReader(is, "GBK");

        BufferedReader br = new BufferedReader(isr);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}
