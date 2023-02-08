package com.enze.d4_transfer_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class CharSetTest {
    public static void main(String[] args) {
        try (
                Reader fr = new FileReader("C:\\code\\data.txt");
                BufferedReader bfr = new BufferedReader(fr);
        ) {
            String line;
            while ((line = bfr.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
