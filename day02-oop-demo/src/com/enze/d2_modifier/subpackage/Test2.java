package com.enze.d2_modifier.subpackage;

import com.enze.d2_modifier.Father;
import com.enze.d2_modifier.Test;

public class Test2 extends Father{
    public static void main(String[] args) {
        Father f = new Father();
        f.publicMethod();
        Test2 t = new Test2();
        t.protectedMethod();
        t.publicMethod();
    }
}
