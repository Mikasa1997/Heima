package com.enze.d8_abstract_attention;

public class Son extends Father{
    @Override
    public void writePaper() {
        super.writePaper();
    }

    @Override
    public void write() {
        System.out.println("这是Son的write方法");
    }
}
