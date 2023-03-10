package com.enze.d4_polymorphic_test;

public class Mouse implements USB{
    private String name;

    public Mouse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name + "成功连接了电脑");
    }

    @Override
    public void unconnect() {
        System.out.println(name + "从电脑中拔出");
    }
    /* 独有功能 */
    public void doubleClick(){
        System.out.println(name + "双击点亮小红心，一键三连");
    }
}
