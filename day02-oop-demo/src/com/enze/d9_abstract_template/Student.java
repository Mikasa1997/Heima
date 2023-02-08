package com.enze.d9_abstract_template;

public abstract class Student {
    /* 这是一个模板方法 */
    public final void writePaper(){
        System.out.println("\t\t\t《我的爸爸》");
        System.out.print("我的爸爸是一位");
        System.out.println(studentWrite());
        System.out.println("我很喜欢我的爸爸！");
    }

    public abstract String studentWrite();

}
