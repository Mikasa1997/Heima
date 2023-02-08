package com.enze.d4_byte_stream;

import java.io.*;

public class FileInputStreamDemo5 {
    public static void main(String[] args) throws Exception {
        OutputStream os = new FileOutputStream("day09-file-io-app/src/data03.txt", true);

        os.write('a');
        os.write(98);
        os.write("\r\n".getBytes());

        byte[] buffer1 = {'a', 98, 97};
        os.write(buffer1);
        byte[] buffer2 = "我是中国人".getBytes();
        os.write(buffer2);

        byte[] buffer3 = {'a', 98, 97};
        os.write(buffer3, 0, 3);

        os.flush();
        os.close();
    }
}
