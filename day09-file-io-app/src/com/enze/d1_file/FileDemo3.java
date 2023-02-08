package com.enze.d1_file;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        File f = new File("day09-file-io-app/src/data.txt");
        System.out.println(f.createNewFile());
        File f1 = new File("day09-file-io-app/src/data02.txt");
        System.out.println(f1.createNewFile());
    }
}
