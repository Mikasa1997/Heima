package com.enze.d8_char_buffer;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BufferedCharTest {
    public static void main(String[] args) {
        try (
                Reader fr = new FileReader("day09-file-io-app\\src\\csb.txt");
                BufferedReader br = new BufferedReader(fr);

                Writer fw = new FileWriter("day09-file-io-app\\src\\csb_output.txt");
                BufferedWriter bw = new BufferedWriter(fw);

        ) {
            String line;
            List<String> data = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                data.add(line);
            }//拿到了列表
            List<String> sizes = new ArrayList<>();
            Collections.addAll(sizes, "一", "二", "三", "四", "五", "陆", "柒", "八", "九", "十", "十一");
            Collections.sort(data, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return sizes.indexOf(o1.substring(0, (o1.indexOf("."))))
                            - sizes.indexOf(o2.substring(0, (o2.indexOf("."))));
                }
            });//数据列表已经被排好序了
            for (String datum : data) {
                bw.write(datum);
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
